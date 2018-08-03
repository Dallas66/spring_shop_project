package com.epam.rd.denis.springshop.controllers;

import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping("admin")
    public ModelAndView getProducts() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("listProducts", productService.productList());
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @PostMapping("/admin/add")
    public ModelAndView addProduct(@ModelAttribute("product") Product product) {
        ModelAndView modelAndView = new ModelAndView("redirect:/admin");
        this.productService.addProduct(product);
        return modelAndView;

    }

    @RequestMapping("/admin/remove/{id}")
    public ModelAndView removeProduct(@PathVariable("id") int id) {
        this.productService.removeProduct(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/admin");

        return modelAndView;
    }

    @RequestMapping("/admin/edit/{id}")
    public ModelAndView editProduct(@PathVariable("id") int id/*@ModelAttribute("product") Product product*/) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", productService.getProductById(id));
//        modelAndView.addObject("listProducts",productService.productList());
        modelAndView.setViewName("editUser");

        return modelAndView;
    }

    @RequestMapping("/admin/edit")
    public ModelAndView tryEdit(@ModelAttribute("product") Product product) {
        ModelAndView modelAndView = new ModelAndView();
        productService.updateProduct(product);
        modelAndView.setViewName("redirect:/admin");
        return modelAndView;
    }

}
