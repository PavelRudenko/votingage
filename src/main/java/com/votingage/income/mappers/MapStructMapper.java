package com.votingage.income.mappers;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import com.votingage.income.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface MapStructMapper {
  //  MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

    UserDto toUserDto(User user);
    User toUser (UserDto userDto);

}
