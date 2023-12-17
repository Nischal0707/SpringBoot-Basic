package com.practice.demo.com;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Long age;

    @Column(name="location")
    private String location;

    @Column(name="email")
    private String email;

    @Column(name="department")
    private String department;
}
