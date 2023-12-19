package com.practice.demo.nis;

import com.practice.demo.com.Employee;

import com.practice.demo.service.EmployeeService;
import jakarta.validation.Valid;
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
    public Employee getEmployee (@PathVariable("id")long id){
    return eService.getSingleEmployee(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee (@Valid @RequestBody Employee employee){
    return eService.saveEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public  Employee updateEmployee (@PathVariable Long id, @RequestBody  Employee employee){
     employee.setId(id);
     return eService.updateEmployee(employee);
    }

    @DeleteMapping("/employees")
    public void deleteEmployee (@RequestParam Long id){
    eService.deleteEmployee(id);
    }
}
