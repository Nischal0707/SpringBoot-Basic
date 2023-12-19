package com.practice.demo.service;

import com.practice.demo.com.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee saveEmployee (Employee employee);
    Employee getSingleEmployee ( Long id);

    void deleteEmployee (Long id);

    Employee updateEmployee (Employee employee);
}
