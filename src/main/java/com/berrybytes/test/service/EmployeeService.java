package com.berrybytes.test.service;

import com.berrybytes.test.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> geAllEmployee();


}
