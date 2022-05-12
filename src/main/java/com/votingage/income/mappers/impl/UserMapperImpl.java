package com.votingage.income.mappers.impl;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import com.votingage.income.mappers.MapStructMapper;
import com.votingage.income.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements MapStructMapper {

    @Override
    public UserDto toUserDto(User user) {
        return UserDto.builder()
                .firstName(user.getFirstName())
                .build();
    }

    @Override
    public User toUser(UserDto userDto) {
        return User.builder()
                .firstName(userDto.getFirstName())
                .build();
    }
}
