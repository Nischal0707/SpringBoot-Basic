package com.practice.demo.com;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

//    @OneToOne(mappedBy = "department")
//    private Employee employee;
}

