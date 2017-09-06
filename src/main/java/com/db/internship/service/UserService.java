package com.db.internship.service;

import java.util.List;

import com.db.internship.model.User;

public interface UserService {
    public User findById(Long id);
    public User findByUsername(String username);
    public List<User> findAll ();
}
