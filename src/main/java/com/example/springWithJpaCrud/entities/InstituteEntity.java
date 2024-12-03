package com.example.springWithJpaCrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="student")
@Entity
public class InstituteEntity {
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="mobile")
private String mobile;
@Column(name="email")
private String email;
}
