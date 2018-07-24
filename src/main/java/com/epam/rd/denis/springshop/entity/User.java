package com.epam.rd.denis.springshop.entity;

import lombok.*;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ToString(includeFieldNames=true)
public class User {
    @NotNull
    private int id;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty(message = "Please enter your Last Name.")
    private String lname;
    @NotNull
    @NotEmpty(message = "Please enter your Login.")
    private String login;
    @NotNull
    @NotEmpty(message = "Please enter your Password.")
    private String password;
    @NotEmpty(message = "Please rewrite your Password")
    private String confirmPassword;
    @NotNull
    private RoleEnum role;
}
