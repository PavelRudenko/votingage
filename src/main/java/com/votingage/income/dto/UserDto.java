package com.votingage.income.dto;

import com.neovisionaries.i18n.CountryCode;
import com.votingage.income.model.Sex;
import com.votingage.income.model.VoteTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
   /* private Integer age;
    private Sex sex;
    private String phoneNumber;
    private String country;
    private List<VoteTable> votedTables;*/

}
