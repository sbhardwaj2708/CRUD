package com.springboot.crud.repository;

import com.springboot.crud.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<employee, Long> {
}
