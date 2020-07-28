package com.gorantla.exception.service;
import org.springframework.stereotype.Service;

import com.gorantla.exception.entity.Employee;

@Service
public class EmployeeService {

	//return employee object
	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

    //return employee as null
	public Employee getEmployeeNull() throws EmployeeServiceException {

		return null;
	}

    //throw exception
	public Employee getEmployeeException() throws EmployeeServiceException {

		throw new EmployeeServiceException();
	}

}