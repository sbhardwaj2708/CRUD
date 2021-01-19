package com.springboot.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private char name;

    @Column(name = "Age")
    private int age;

    @Column(name = "Address")
    private char address;

    public employee() {
    }

    public employee(char name, int age, char address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getAddress() {
        return address;
    }

    public void setAddress(char address) {
        this.address = address;
    }
}
