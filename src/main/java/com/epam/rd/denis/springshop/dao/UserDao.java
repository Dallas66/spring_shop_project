package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);

    User getUserById(int id);

    User getUserByLogin(String login);

    List<User> getUserList();


}
