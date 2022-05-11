package com.votingage.income.service;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDto getUserByName(String name);

}
