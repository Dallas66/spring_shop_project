package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.customException.InvalidPasswordException;
import com.epam.rd.denis.springshop.customException.UserNotFoundException;
import com.epam.rd.denis.springshop.dao.UserRepository;
import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;



    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);


    }

    @Override
    public User authenticateUser(Login login) throws UserNotFoundException, InvalidPasswordException {
        User userReturn = userRepository.findByLogin(login.getLogin());
        if (userReturn == null) {
            throw new UserNotFoundException();
        }
        if (!userReturn.getPassword().equals(login.getPassword())) {
            throw new InvalidPasswordException();
        }
        return userReturn;
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
