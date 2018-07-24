package com.epam.rd.denis.springshop.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ToString(includeFieldNames = true)
public class Login {
    @NotNull
    @NotEmpty(message = "Enter your Login")
    private String login;
    @NotNull
    @NotEmpty(message = "Enter your Password")
    private String password;
}
