package com.practice.demo.service;

import com.practice.demo.com.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees(int pageNumber, int pageSize);

    Employee saveEmployee (Employee employee);
    Employee getSingleEmployee ( Long id);

    void deleteEmployee (Long id);

    Employee updateEmployee (Employee employee);

//    List<Employee> getEmployeesByName(String name);
//
//    List<Employee> getEmployeesByNameAndLocation(String name, String location);
//
//    List<Employee> getEmployeesByKeyword(String name);
//
//    List<Employee> getEmployeesByNameOrLocation(String name, String location);
//
//    Integer deleteByEmployeeName (String name);

}
