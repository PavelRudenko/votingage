package com.votingage.income.dao;

import com.votingage.income.model.User;

import java.util.List;

public interface UserDao {
    User findByFirstName(String name);

    List<User> findAll();
}
