package com.epam.rd.denis.springshop.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ToString(includeFieldNames=true)
public class User {
    /*private int id;*/
    @NotNull
    @NotEmpty(message = "Please enter your name.")
    private String name;
    @NotNull
    @NotEmpty
    private String lname;
    @NotNull
    @NotEmpty
    private String login;
    @NotNull
    @NotEmpty
    private String password;
}
