package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Category;

import java.util.List;

public interface CategoryDao {

    //узнать как лучше поступить с категориями
    //узнать как лучше поступить с ордером

    void addCategory(Category category);
    void removeCategory(int id);
    void updateCategory(Category category);
    Category getCategoryByName(String name);
    List<Category> getCategoryList();

}
