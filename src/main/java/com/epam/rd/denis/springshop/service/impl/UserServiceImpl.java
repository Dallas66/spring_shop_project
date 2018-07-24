package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.customException.InvalidPasswordException;
import com.epam.rd.denis.springshop.customException.UserNotFoundException;
import com.epam.rd.denis.springshop.dao.UserDao;
import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public User authenticateUser(Login login) throws UserNotFoundException, InvalidPasswordException {
        User userReturn = userDao.getUserByLogin(login.getLogin());
        if (userReturn == null){
            throw new UserNotFoundException();
        }
        if (!userReturn.getPassword().equals(login.getPassword())){
            throw new InvalidPasswordException();
        }
        return userReturn;
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return this.userDao.getUserList();
    }
}
