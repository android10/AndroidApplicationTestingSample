package com.fernandocejas.MyApplication.test.core;

import com.fernandocejas.MyApplication.core.Employee;
import com.fernandocejas.MyApplication.test.MyApplicationTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.mock;

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

    @Test
    public void testMockitoOne() {
        Employee mockEmployee = mock(Employee.class);

        given(mockEmployee.getName()).willReturn("Roberto");

        assertThat(mockEmployee.getName(), is(equalTo("Roberto")));

        verify(mockEmployee).getName();
        verifyNoMoreInteractions(mockEmployee);
    }
}
