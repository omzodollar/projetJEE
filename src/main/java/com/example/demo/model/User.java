package com.example.demo.model;


import org.hibernate.validator.constraints.NotEmpty;
 
import javax.persistence.*;
import java.io.Serializable;
 
@SuppressWarnings("deprecation")
@Entity
@Table(name="APP_USER")
public class User implements Serializable{
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
 
    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;
 
    @Column(name="AGE", nullable=false)
    private Integer age;
 
    @Column(name="SALARY", nullable=false)
    private double salary;
 
}