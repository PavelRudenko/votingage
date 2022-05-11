package com.votingage.income.controller;

import com.votingage.income.dao.UserDao;
import com.votingage.income.dto.UserDto;
import com.votingage.income.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> getCurrentUser (UserDto name){
        final UserDto userDtoResponse = userService.getUserByName(name);
        return new ResponseEntity<>(userDtoResponse,HttpStatus.OK);
    }

}
