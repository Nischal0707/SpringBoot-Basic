package com.practice.demo.nis;

import com.practice.demo.Request.EmployeeRequest;
import com.practice.demo.com.Department;
import com.practice.demo.com.Employee;

import com.practice.demo.dao.EmployeeDAO;
import com.practice.demo.repository.DepartmentRepository;
import com.practice.demo.repository.EmployeeRepository;
import com.practice.demo.response.EmployeeResponse;
import com.practice.demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Employeecontroller {

//    @Autowired
//    private EmployeeService eService;

    @Autowired
    private EmployeeRepository eRepo;

//    @Autowired
//    private DepartmentRepository dRepo;

//    @GetMapping("/employees")
//    public ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
//        return new ResponseEntity<List<Employee>>(eService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
//    }


//    @GetMapping("/employees")
//    public ResponseEntity<List<EmployeeResponse>> getEmployees (){
//        List<Employee> list = eRepo.findAll();
//        List<EmployeeResponse> responseList = new ArrayList<>();
//        list.forEach(e -> {
//            EmployeeResponse eResponse = new EmployeeResponse();
//            eResponse.setId(e.getId());
//            eResponse.setEmployeeName(e.getName());
//            List<String> depts = new ArrayList<>();
//            for (Department d : e.getDepartments()) {
//                depts.add(d.getName());
//            }
//            eResponse.setDepartment(depts);
//            responseList.add(eResponse);
//        });
//        return new ResponseEntity<List<EmployeeResponse>>(responseList, HttpStatus.OK);
//        }
//
//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Employee> getEmployee(@PathVariable("id") long id) {
//        return new ResponseEntity<Employee>(eService.getSingleEmployee(id), HttpStatus.OK);
//    }

    @PostMapping("/employees")
    public Employee saveEmployee (@RequestBody Employee employee){
    return eRepo.save(employee);
    }

    @Autowired
    private EmployeeDAO eDAO;
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
       // return eRepo.getEmployees();
      //  return eDAO.getAll();
        return eRepo.getAllRecords();
    }
}

//        Employee employee = new Employee(eRequest);
//        employee = eRepo.save(employee);
//
//        for (String s : eRequest.getDepartment()){
//            Department d = new Department();
//            d.setName(s);
//            d.setEmployee(employee);
//
//            dRepo.save(d);
//        }
//        return new ResponseEntity<String>("Record saved successfully", HttpStatus.CREATED);
//
////        Department dept = new Department();
////        dept.setName(eRequest.getDepartment());
////        dept = dRepo.save(dept);
////
////        Employee employee = new Employee(eRequest);
////        employee.setDepartment(dept);
////
////        return new ResponseEntity<Employee>(eRepo.save(employee),HttpStatus.CREATED);
//
//       }
//
//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
//        employee.setId(id);
//        return new ResponseEntity<Employee>(eService.updateEmployee(employee), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/employees")
//    public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id) {
//        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
//    }
//
////    @GetMapping("/employees/filter/{name}")
////    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String name) {
//////       return new ResponseEntity<List<Employee>>(eRepo.findByDepartmentName(name), HttpStatus.OK);
////        return new ResponseEntity<List<Employee>>(eRepo.getEmployeesByDeptName(name), HttpStatus.OK);
////    }
////
////
//}
