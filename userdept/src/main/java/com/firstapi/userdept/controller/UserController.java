package com.firstapi.userdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapi.userdept.model.Department;
import com.firstapi.userdept.model.User;
import com.firstapi.userdept.repository.DepartmentRepository;
import com.firstapi.userdept.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    // somente como forma de aprendizado
    @PostMapping("insertDepartment")
    public Department inserDepartment(@RequestBody Department department) {
        return departmentRepository.save(department);
    }

}