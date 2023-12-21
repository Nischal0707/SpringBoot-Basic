package com.practice.demo.com;


import com.practice.demo.Request.EmployeeRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_employee")
@NoArgsConstructor
// @NamedNativeQuery(name= "getAllRecords", query= "select * from tbl_employee", resultClass = Employee.class )
@NamedQuery(name = "Employee.getAllRecords", query = "FROM Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String location;


//    @OneToOne
//    @JoinColumn(name="department_id")
//    private Department department;
//
//    @OneToMany(mappedBy = "employee")
//    private List<Department> departments;
//
//    public Employee(EmployeeRequest req) {
//        this.name = req.getName();
//    }

}
