package com.backendproject.springboot_manytoone.entity;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(
            mappedBy = "Employee",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private List<Item>items=new ArrayList<>();




    public Employee(String name){
        this.name=name;

    }
    public  void setItems(List<Item>items){
    this.items=items;

    }
}





