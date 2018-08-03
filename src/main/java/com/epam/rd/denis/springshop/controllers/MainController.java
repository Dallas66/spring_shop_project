package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.dao.OrderDao;
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
    @Autowired
    OrderDao orderDao;

    @GetMapping("/index1")
    public ModelAndView auth() {
        ModelAndView modelAndView = new ModelAndView();

        List<Category> listOfCategory = categoryService.getCategoryList();

        for (Category category : listOfCategory) {
            category.setProdList(productService.getProductsByCategory(category.getName()));
        }

        int sum = 0;
        for (Product product : orderDao.getOrder().getProductList()) {
            sum += product.getPrice();
        }

        modelAndView.addObject("categList", listOfCategory);
        modelAndView.addObject("user", userManager.getCurrentUser());
        modelAndView.addObject("search", new Search());
        modelAndView.addObject("sum", sum);
        modelAndView.addObject("orderList", orderDao.getOrder().getProductList());
        modelAndView.setViewName("index1");

        return modelAndView;
    }


    @PostMapping("/index1")
    public ModelAndView searchBar(@ModelAttribute("search") Search search, ModelAndView modelAndView) {
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

    @GetMapping("add/{id}")
    public ModelAndView addToCartById(@PathVariable int id, ModelAndView modelAndView) {

        orderDao.addToOrder(productService.getProductById(id));

        int sum = 0;
        for (Product product : orderDao.getOrder().getProductList()) {
            sum += product.getPrice();
        }

        modelAndView.setViewName("redirect:/index1");
        return modelAndView;
    }

    @GetMapping("delete/{id}")
    public ModelAndView deleteFromCart(@PathVariable int id, ModelAndView modelAndView) {
        orderDao.removeFromOrder(productService.getProductById(id));
        modelAndView.setViewName("redirect:/index1");
        return modelAndView;
    }

    @GetMapping("logout")
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView("redirect:/autorization");
        userManager.setCurrentUser(null);
        return modelAndView;
    }
}
