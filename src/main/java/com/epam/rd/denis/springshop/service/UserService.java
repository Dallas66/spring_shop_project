package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.customException.InvalidPasswordException;
import com.epam.rd.denis.springshop.customException.UserNotFoundException;
import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    User authenticateUser(Login login) throws UserNotFoundException, InvalidPasswordException;

    void updateUser(User user);

    Optional<User> getUserById(long id);

    List<User> getUserList();
}
