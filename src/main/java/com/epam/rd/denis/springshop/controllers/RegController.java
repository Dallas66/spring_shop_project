package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.RoleEnum;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import com.epam.rd.denis.springshop.service.UserService;
import com.epam.rd.denis.springshop.validators.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {

    @Autowired
    UserService userService;
    @Autowired
    UserManager userManager;



    @GetMapping("/registration")
    public ModelAndView regPage(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView confRegPage(@ModelAttribute("user") @Validated User user, BindingResult result, Errors errors){

//        userService.addUser(user);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("autorization");
//        return modelAndView;

        new PasswordValidator().validate(user, result);
        if (!result.hasErrors()) {
            user.setRole(RoleEnum.USER);
            userService.addUser(user);
        }
        if (result.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("registration", "user", user);
            return modelAndView;

        }

        return new ModelAndView("autorization","loginModel",new Login());

    }
}
