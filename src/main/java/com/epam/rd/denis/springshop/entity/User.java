package com.epam.rd.denis.springshop.entity;

import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString(includeFieldNames = true)
@Entity
@EqualsAndHashCode
@Table(name = "users")
public class User {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotEmpty(message = "Please enter your Name.")
//    @Column(name = "name")
    private String name;

    @NotNull
    @NotEmpty(message = "Please enter your Last Name.")
//    @Column(name = "lname")
    private String lname;

    @NotNull
    @NotEmpty(message = "Please enter your Login.")
    @Column(name = "login")
    private String login;

    @NotNull
    @NotEmpty(message = "Please enter your Password.")
//    @Column(name = "password")
    private String password;

    @NotEmpty(message = "Please rewrite your Password")
    @Transient
    private String confirmPassword;

//    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    @OneToOne(mappedBy = "user")
    private Order order;
}
