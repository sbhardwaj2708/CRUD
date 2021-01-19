package com.springboot.crud.controller;

import com.springboot.crud.model.employee;
import com.springboot.crud.repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/main/")
public class controller {

    @Autowired
    private employeeRepo employeeRepo;

    //get employees
    @GetMapping("employees")
    public List<employee> getAllEmployee() {
        return this.employeeRepo.findAll();
    }

    //get employee by ID
    //save employee
    //update employee
    //delete employee

}
