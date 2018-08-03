package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;

import java.util.List;

public interface CategoryDao {


    void addCategory(Category category);

    void removeCategory(int id);

    void updateCategory(Category category);

    Category getCategoryByName(CategoryNameEnum name);

    List<Category> getCategoryList();

}
