package com.fernandocejas.MyApplication.test.core;

import com.fernandocejas.MyApplication.core.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.MockitoAnnotations.Mock;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTestAnnotations {

	@Mock
	Employee mockEmployeeField;

	@Spy
	Employee employeeSpy = new Employee("Fernando");

	@Test
	public void testCleanAnnotationTest() {
		given(mockEmployeeField.getName()).willReturn("Fernando");

		assertThat(mockEmployeeField.getName(), is(equalTo("Fernando")));

		verify(mockEmployeeField).getName();
		verifyNoMoreInteractions(mockEmployeeField);
	}

	@Test
	public void testSpyMethod() {
		given(employeeSpy.getName()).willReturn("Fernandito");

		assertThat(employeeSpy.getName(), equalTo("Fernandito"));

		verify(employeeSpy).getName();
	}

	@Test
	public void testStaticMethod() {
		given(employeeSpy.getLibraryValue()).willReturn("static");

		assertThat(employeeSpy.getStaticValueInNonStaticMethod(), equalTo("static"));

		verify(employeeSpy).getStaticValueInNonStaticMethod();
	}
}
