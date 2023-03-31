package com.firstapi.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapi.userdept.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}