package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import com.epam.rd.denis.springshop.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);

    void removeProduct(int id);

    void updateProduct(Product product);

    Product getProductById(int id);

    List<Product> getProductsByCategory(CategoryNameEnum cat);

    List<Product> productList();

    List<Product> getProductByName(String name);
}
