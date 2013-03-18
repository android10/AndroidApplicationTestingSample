package com.fernandocejas.MyApplication.test.core;

import com.fernandocejas.MyApplication.core.Employee;
import com.fernandocejas.MyApplication.test.MyApplicationTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Copyright (c) Tuenti Technologies. All rights reserved.
 *
 * @author fcejas
 */
@RunWith(MyApplicationTestRunner.class)
public class EmployeeTest {

	@Test
	public void testGetName() {
		Employee employee = new Employee("Fernando");
		assertThat(employee.getName(), is(equalTo("Fernando")));
	}

	@Test(expected = RuntimeException.class)
	public void testThrowException() {
		Employee employee = new Employee("Fernando");
		employee.throwException();
	}

	@Test
	public void testSetName() {
		Employee mockEmployee = mock(Employee.class);

		mockEmployee.setName("Hola");

		verify(mockEmployee).setName("Hola");
		verify(mockEmployee, never()).setName("Fer");
	}
}
