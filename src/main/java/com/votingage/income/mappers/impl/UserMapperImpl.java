package com.votingage.income.mappers.impl;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import com.votingage.income.mappers.MapStructMapper;
import com.votingage.income.model.User;
import lombok.Builder;


public class UserMapperImpl implements MapStructMapper {
    @Override
    public UserDto toUserDto(User user) {
         UserDto userDto= UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
         return userDto;
    }
}
