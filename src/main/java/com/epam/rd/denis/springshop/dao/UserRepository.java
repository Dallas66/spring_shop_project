package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByLogin(String login);
}
