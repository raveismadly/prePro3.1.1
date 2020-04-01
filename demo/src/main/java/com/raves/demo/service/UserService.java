package com.raves.demo.service;

import com.raves.demo.model.Role;
import com.raves.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getUserById(int id);
    void setRole(User user, Role role);
}
