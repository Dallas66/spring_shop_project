package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.ProductDao;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        productDao.removeProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    @Override
    public List<Product> getProductsByCategory(String cat) {
        return productDao.getProductsByCategory(cat);
    }

    @Override
    public List<Product> productList() {
        return productDao.productList();
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productDao.getProductByName(name);
    }
}
