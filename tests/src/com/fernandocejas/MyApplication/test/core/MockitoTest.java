package com.fernandocejas.MyApplication.test.core;

import com.fernandocejas.MyApplication.core.Employee;
import com.fernandocejas.MyApplication.test.MyApplicationTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.Mock;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
@RunWith(MyApplicationTestRunner.class)
public class MockitoTest {

	@Mock
	Employee mockEmployeeField;

	@Before
	public void executeBeforeEachTest() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMockitoOne() {
		Employee mockEmployee = mock(Employee.class);

		given(mockEmployee.getName()).willReturn("Roberto");

		assertThat(mockEmployee.getName(), is(equalTo("Roberto")));

		verify(mockEmployee).getName();
		verifyNoMoreInteractions(mockEmployee);
	}

	@Test(expected = RuntimeException.class)
	public void testException() {
		Employee mockEmployee = mock(Employee.class);

		given(mockEmployee.getName()).willThrow(new RuntimeException());

		mockEmployee.getName();

		verify(mockEmployee).getName();
		verifyNoMoreInteractions(mockEmployee);
	}

	@Test
	public void testMockitoAnnotations() {
		given(mockEmployeeField.getName()).willReturn("Fernando");

		assertThat(mockEmployeeField.getName(), is(equalTo("Fernando")));

		verify(mockEmployeeField).getName();
		verifyNoMoreInteractions(mockEmployeeField);
	}
}
