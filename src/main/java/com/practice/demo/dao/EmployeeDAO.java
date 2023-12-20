package com.practice.demo.dao;

import com.practice.demo.com.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO {

    @PersistenceContext
    private EntityManager manager;
    public List<Employee> getAll(){
      return manager.createNamedQuery("getAllRecords", Employee.class).getResultList();
    }
}
