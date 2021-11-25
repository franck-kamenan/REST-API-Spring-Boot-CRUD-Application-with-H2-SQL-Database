package com.example.demoralizr.dao;

import com.example.demoralizr.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
