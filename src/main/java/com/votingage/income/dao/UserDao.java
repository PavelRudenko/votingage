package com.votingage.income.dao;

import com.votingage.income.model.User;

public interface UserDao {
    User findByFirstName(String name);
}
