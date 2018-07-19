package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

     User authenticateUser(String login, String password);

    void updateUser(User user);

    User getUserById(int id);

    List<User> getUserList();
}
