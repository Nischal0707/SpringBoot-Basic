package com.practice.demo.repository;

import com.practice.demo.com.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//   List<Employee> findByName(String name);
//
//   List<Employee> findByNameAndLocation(String name, String location);
//
//   List<Employee> findByNameContaining(String keyboard, Sort sort);
//
//   @Query("FROM Employee WHERE name=:name OR location =:location")
//   List<Employee> getEmployeesByNameOrLocation(String name, String location);
//
//   @Transactional
//   @Modifying
//   @Query("DELETE FROM Employee WHERE name=:name")
//   Integer deleteEmployeeNByName(String name);


//    List<Employee> findByDepartmentName(String name);
//
//    @Query("FROM Employee WHERE department.name=:name")
//    List<Employee> getEmployeesByDeptName (String name);

    @Query(value = "select * from tbl_employee", nativeQuery = true)
    List<Employee> getEmployees ();

}
