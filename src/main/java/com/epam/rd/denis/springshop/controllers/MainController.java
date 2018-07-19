package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserManager userManager;

    @GetMapping("/index1")
    public ModelAndView auth() {
        ModelAndView modelAndView = new ModelAndView();

        //
        List<Product> prod = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product product = new Product(i, "lname" + i, "static/img/product.png", "des", 10 + i);
            prod.add(product);
        }
        List<Product> prod1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product product = new Product(i+5, "lname" + i+5, "static/img/product.png", "des", 10 + i);
            prod1.add(product);
        }
        modelAndView.addObject("user", userManager.getCurrentUser());
        modelAndView.addObject("list", prod1);
        modelAndView.addObject("listt", prod);
        modelAndView.setViewName("index1");

        return modelAndView;
    }
}
