package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.ProductRepository;
import com.epam.rd.denis.springshop.entity.Category;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

//    @PersistenceContext
//    EntityManager entityManager;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void removeProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
//        entityManager.merge(product);
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getProductsByCategory(Category cat) {
        return productRepository.findByCategory(cat);
    }

    @Override
    public List<Product> productList() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }
}
