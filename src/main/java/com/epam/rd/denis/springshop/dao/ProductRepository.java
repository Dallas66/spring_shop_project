package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);

    List<Product> findByName(String name);

}
