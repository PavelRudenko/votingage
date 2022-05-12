package com.votingage.income.service.impl;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import com.votingage.income.mappers.MapStructMapper;
import com.votingage.income.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final MapStructMapper mapStructMapper;
    private final UserDao userDao;

    @Override
    public UserDto getUserByName(String name) {
        return mapStructMapper.toUserDto(userDao.findByFirstName(name));

    }
}
