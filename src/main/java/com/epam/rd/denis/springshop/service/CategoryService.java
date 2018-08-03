package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);

    void removeCategory(int id);

    void updateCategory(Category category);

    Category getCategoryByName(String name);

    List<Category> getCategoryList();
}
