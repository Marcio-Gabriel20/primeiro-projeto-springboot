package com.firstapi.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapi.userdept.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    


}