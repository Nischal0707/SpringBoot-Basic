package com.practice.demo.nis;

import com.practice.demo.com.Employee;

import com.practice.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecontroller {

    @Autowired
    private EmployeeService eService;


    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployee (@PathVariable("id")long id){
    return "Fetching the employee details for the id"+id;
    }

    @PostMapping("/employees")
    public Employee saveEmployee (@RequestBody Employee employee){
    return eService.saveEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public  Employee updateEmployee (@PathVariable Long id, @RequestBody  Employee employee){
    System.out.println("updating the employee data for the id"+id);
    return employee;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee (@RequestParam Long id){
    return "deleting the employee details for the id"+id;
    }

}
