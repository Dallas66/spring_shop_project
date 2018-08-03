package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.CategoryRepository;
import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import com.epam.rd.denis.springshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void removeCategory(long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategoryByName(CategoryNameEnum name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }
}
