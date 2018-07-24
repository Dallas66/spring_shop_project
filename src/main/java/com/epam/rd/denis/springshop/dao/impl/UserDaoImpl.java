package com.epam.rd.denis.springshop.dao.impl;

import com.epam.rd.denis.springshop.dao.UserDao;
import com.epam.rd.denis.springshop.entity.RoleEnum;
import com.epam.rd.denis.springshop.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        User admin = new User();
        admin.setId(1);
        admin.setName("DenAdmin");
        admin.setLname("Prot");
        admin.setLogin("admin");
        admin.setPassword("admin");
        admin.setRole(RoleEnum.ADMIN);
        User user = new User();
        user.setId(2);
        user.setName("DenUser");
        user.setLname("Prot");
        user.setLogin("user");
        user.setPassword("user");
        user.setRole(RoleEnum.USER);
        usersRepository.add(admin);
        usersRepository.add(user);
//        userMap.put(1,admin);
//        userMap.put(2,user);
    }

    private Map<Integer, User> userMap = new HashMap<>();
    private List<User> usersRepository = new ArrayList<>();
    private int idGenerator = 3;

    public List<User> getUsersRepository() {
        return usersRepository;
    }

    public void setUsersRepository(List<User> usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<Integer, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public void addUser(User user) {
        user.setId(idGenerator);
        usersRepository.add(user);
        idGenerator++;
//        userMap.put(idGenerator, user);
    }

    @Override
    public void removeUser(int id) {
        User user = usersRepository.stream().filter(userFind -> userFind.getId() == id).findFirst().orElse(null);
        usersRepository.remove(user);
//        userMap.remove(id);
    }

    @Override
    public void updateUser(User user) {
    }

    @Override
    public User getUserById(int id) {
//        return userMap.get(id);
        return usersRepository.stream().filter(userFind -> userFind.getId() == id).findFirst().orElse(null);


    }

    @Override
    public User getUserByLogin(String login) {
//        User user = null;
//        for (User u : userMap.values()) {
//            if (u.getLogin().equals(login))
//                user = u;
//        }
//        return user;
        return usersRepository.stream().filter(user -> user.getLogin().equals(login)).findFirst().orElse(null);
    }


    @Override
    public List<User> getUserList() {
//        return new ArrayList<>(userMap.values());
        return usersRepository;
    }
}
