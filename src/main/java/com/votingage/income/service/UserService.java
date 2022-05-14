package com.votingage.income.service;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    UserDto getUserByName(String name);

    List<UserDto> findAllUsers();
}
