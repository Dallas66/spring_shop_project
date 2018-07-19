package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import com.epam.rd.denis.springshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthController {

    @Autowired
    UserService userService;
    @Autowired
    UserManager userManager;


    @GetMapping("/")
    public ModelAndView getStartPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("autorization");
        return modelAndView;
    }

    @GetMapping("/autorization")
    public ModelAndView getLoginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("autorization");
        return modelAndView;
    }

    @PostMapping("/authProcess")
    public ModelAndView auth(@RequestParam String login,
                             @RequestParam String password) {
        ModelAndView modelAndView = new ModelAndView("redirect:/index1");
        User user = userService.authenticateUser(login, password);


        if (user != null) {
            userManager.setCurrentUser(user);
            return modelAndView;

        }

        modelAndView.setViewName("autorization");

        return modelAndView;
    }


}
