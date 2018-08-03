package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(CategoryNameEnum name);


}
