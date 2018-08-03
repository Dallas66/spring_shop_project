package com.epam.rd.denis.springshop.dao.impl;

import com.epam.rd.denis.springshop.dao.ProductDao;
import com.epam.rd.denis.springshop.entity.CategoryNameEnum;
import com.epam.rd.denis.springshop.entity.Product;
import org.springframework.stereotype.Repository;


import java.util.LinkedList;
import java.util.List;


import static java.util.stream.Collectors.toList;

@Repository
public class ProductDaoImpl implements ProductDao {


    private List<Product> productRepository = new LinkedList<>();

    public ProductDaoImpl() {
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(i, "first" + i, "img/product.png", "des", 10 + i, CategoryNameEnum.FIRST_CAT);
            productRepository.add(product);
        }
        for (int i = 6; i <= 10; i++) {
            Product product = new Product(i, "second" + i, "img/product.png", "des", 12 + i, CategoryNameEnum.SECOND_CAT);
            productRepository.add(product);
        }
        for (int i = 11; i <= 15; i++) {
            Product product = new Product(i, "third" + i, "img/product.png", "des", 13 + i, CategoryNameEnum.THIRD_CAT);
            productRepository.add(product);
        }
    }


    @Override
    public void addProduct(Product product) {
        productRepository.add(product);
    }

    @Override
    public void removeProduct(int id) {
        // выносить продукт или нет? почему оно возвращает null?
        productRepository.remove(productRepository.stream().filter(product -> product.getId() == id).findFirst().orElse(null));

    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productRepository.size(); i++) {
            if (productRepository.get(i).getId() == product.getId()) {
                productRepository.remove(i);
                productRepository.add(i, product);
            }
        }

    }

    @Override
    public Product getProductById(int id) {
        return productRepository.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Product> getProductsByCategory(CategoryNameEnum cat) {
        return productRepository.stream().filter(product -> product.getCatName().equals(cat)).collect(toList());
    }

    @Override
    public List<Product> productList() {
        return productRepository;
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepository.stream().filter(product -> product.getName().equals(name)).collect(toList());
    }

    public List<Product> getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(List<Product> productRepository) {
        this.productRepository = productRepository;
    }
}
