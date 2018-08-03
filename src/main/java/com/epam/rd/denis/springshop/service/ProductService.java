package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import com.epam.rd.denis.springshop.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void addProduct(Product product);

    void removeProduct(long id);

    void updateProduct(Product product);

    Optional<Product> getProductById(long id);

    List<Product> getProductsByCategory(Category cat);

    List<Product> productList();

    List<Product> getProductByName(String name);
}
