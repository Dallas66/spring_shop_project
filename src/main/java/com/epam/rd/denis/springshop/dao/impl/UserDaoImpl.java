package com.epam.rd.denis.springshop.dao.impl;

import com.epam.rd.denis.springshop.dao.UserDao;
import com.epam.rd.denis.springshop.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    private  Map<Integer, User> userMap = new HashMap<>();
    private  int idGenerator = 0;

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<Integer, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public void addUser(User user) {
        idGenerator++;
        userMap.put(idGenerator,user);
    }

    @Override
    public void removeUser(int id) {
        userMap.remove(id);
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public User getUserById(int id) {
        return userMap.get(id);
    }

    @Override
    public User getUserByLogin(String login) {
        User user = null;
        for (User u : userMap.values()){
            if (u.getLogin().equals(login))
                user=u;
        }
        return user;
    }


    @Override
    public List<User> getUserList() {
        return new ArrayList<>(userMap.values());
    }
}
