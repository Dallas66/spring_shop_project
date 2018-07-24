package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.Search;
import com.epam.rd.denis.springshop.managers.UserManager;
import com.epam.rd.denis.springshop.service.ProductService;
import com.epam.rd.denis.springshop.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserManager userManager;
    @Autowired
    ProductService productService;
    @Autowired
    CategoryServiceImpl categoryService;

    @GetMapping("/index1")
    public ModelAndView auth() {
        ModelAndView modelAndView = new ModelAndView();

        List<Category> listOfCategory = categoryService.getCategoryList();

        for (Category category : listOfCategory) {
            category.setProdList(productService.getProductsByCategory(category.getName()));
        }


        modelAndView.addObject("categList", listOfCategory);
        modelAndView.addObject("user", userManager.getCurrentUser());
        modelAndView.addObject("search",new Search());
        modelAndView.setViewName("index1");

        return modelAndView;
    }


    @PostMapping("/index1")
    public ModelAndView searchBar(@ModelAttribute("search") Search search,ModelAndView modelAndView) {
        List<Product> searchList = productService.getProductByName(search.getName());
        modelAndView.addObject("searchList", searchList);

        List<Category> listOfCategory = categoryService.getCategoryList();

        for (Category category : listOfCategory) {
            category.setProdList(productService.getProductsByCategory(category.getName()));
        }

        modelAndView.addObject("categList", listOfCategory);
        modelAndView.addObject("user", userManager.getCurrentUser());
        modelAndView.setViewName("index1");

        return modelAndView;
    }
}
