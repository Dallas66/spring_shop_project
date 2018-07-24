package com.epam.rd.denis.springshop.dao.impl;

import com.epam.rd.denis.springshop.dao.CategoryDao;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import com.epam.rd.denis.springshop.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CategoryDaoImpl implements CategoryDao {

    private List<Category> catRepository = new ArrayList<>();


    public CategoryDaoImpl() {
        Category category = new Category(1,CategoryNameEnum.FIRST_CAT.toString());
        Category category2 = new Category(2,CategoryNameEnum.SECOND_CAT.toString());
        Category category3 = new Category(3,CategoryNameEnum.THIRD_CAT.toString());
        catRepository.add(category);
        catRepository.add(category2);
        catRepository.add(category3);
    }

    @Override
    public void addCategory(Category category) {
        catRepository.add(category);
    }

    @Override
    public void removeCategory(int id) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public Category getCategoryByName(String name) {
        return catRepository.stream().filter(category -> category.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public List<Category> getCategoryList() {
        return catRepository;
    }

    public List<Category> getCatRepository() {
        return catRepository;
    }

    public void setCatRepository(List<Category> catRepository) {
        this.catRepository = catRepository;
    }
}
