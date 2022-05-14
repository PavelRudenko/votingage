package com.votingage.income.dto;

import com.neovisionaries.i18n.CountryCode;
import com.votingage.income.model.Sex;
import com.votingage.income.model.VoteTable;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
   /* private Integer age;
    private Sex sex;
    private String phoneNumber;
    private String country;
    private List<VoteTable> votedTables;*/

}
