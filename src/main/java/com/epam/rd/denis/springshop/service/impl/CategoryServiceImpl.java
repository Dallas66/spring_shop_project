package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.CategoryDao;
import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public void removeCategory(int id) {
            categoryDao.removeCategory(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryDao.getCategoryByName(name);
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryDao.getCategoryList();
    }
}
