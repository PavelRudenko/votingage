package com.votingage.income.dao.impl;

import com.votingage.income.dao.UserDao;
import com.votingage.income.model.User;
import com.votingage.income.persistence.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Component
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByFirstName(String name) {
        return userRepository.findByFirstName(name).orElseThrow(
                () -> new EntityNotFoundException(String.format("No such user with name %s", name)));


    }
}
