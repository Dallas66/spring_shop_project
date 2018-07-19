package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import com.epam.rd.denis.springshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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

    @PostMapping("/registrProcess")
    public ModelAndView confRegPage(@ModelAttribute("user") @Validated User user, BindingResult result, Errors errors){

//        userService.addUser(user);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("autorization");
//        return modelAndView;

        if (!result.hasErrors()) {
            userService.addUser(user);
        }
        if (result.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("registration", "user", user);
            return modelAndView;

        }
        else {
            return new ModelAndView("autorization");
        }
    }
}
