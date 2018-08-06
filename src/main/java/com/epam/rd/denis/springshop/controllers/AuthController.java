package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.customException.InvalidPasswordException;
import com.epam.rd.denis.springshop.customException.UserNotFoundException;
import com.epam.rd.denis.springshop.entity.Login;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import com.epam.rd.denis.springshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    UserManager userManager;


    @GetMapping("/")
    public ModelAndView getStartPage(@ModelAttribute("loginModel") Login login) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("autorization");
//        modelAndView.addObject("loginModel", new Login());
        return modelAndView;
    }

    @GetMapping("/autorization")
    public ModelAndView getLoginPage(@ModelAttribute("loginModel") Login login) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("autorization");
//        modelAndView.addObject("loginModel", login);
        return modelAndView;
    }

    @PostMapping("/autorization")
    public ModelAndView auth(@ModelAttribute("loginModel") Login login, BindingResult result, Errors errors) {


        ModelAndView modelAndView = new ModelAndView();
        User user = null;

        if(!login.getLogin().isEmpty()) {
            try {
                user = userService.authenticateUser(login);
            } catch (UserNotFoundException e) {
                errors.rejectValue("login", "login.notfound");
            } catch (InvalidPasswordException e) {
                errors.rejectValue("password", "login.invalidpassword");
            }
        }


        if (!result.hasErrors()) {
            userManager.setCurrentUser(user);
            modelAndView.setViewName("redirect:/index1");

        }

        if (result.hasErrors()) {
//            modelAndView.setViewName("autorization");
//            modelAndView.addObject("loginModel", login);
            return new ModelAndView("autorization","loginmodel",login);
        }


        return modelAndView;
    }


}
