package com.votingage.income.persistence;

import com.neovisionaries.i18n.CountryCode;
import com.votingage.income.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByFirstName(String firstName);

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<User> findByAge(Integer age);

    Optional<User> findByPhoneNumber(String phoneNumber);

    Optional<User> findBySex(String sex);

    Optional<User> findByCountry(String country);

}
