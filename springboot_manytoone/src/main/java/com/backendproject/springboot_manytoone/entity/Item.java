package com.backendproject.springboot_manytoone.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    @ManyToOne
    @JoinColumn(name = "Employee_id")
    private Employee employee;

    public Item(String address) {
        this.address = address;
    }

    public Item(Employee employee) {
        this.employee = employee;
    }
}

