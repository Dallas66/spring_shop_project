package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.OrderRepository;
import com.epam.rd.denis.springshop.dao.ProductRepository;
import com.epam.rd.denis.springshop.dao.ProductsInOrderRepository;
import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.ProductsInOrder;
import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductsInOrderRepository productsInOrderRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void addOrderWithUser(User user) {
        Order order = new Order();
        order.setUser(user);
        orderRepository.save(order);
    }

    @Override
    public void removeOrder(long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void editOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order getOrderById(long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void addToOrder(long productId, Order order,int quantity) {
        Product product = productRepository.findById(productId).get();
//        Order order = orderRepository.findById(orderId).get();

        ProductsInOrder productsInOrder = new ProductsInOrder();
        productsInOrder.setOrder(order);
        productsInOrder.setProduct(product);
        productsInOrder.setQuantity(quantity);
        productsInOrderRepository.save(productsInOrder);

    }

    @Override
    public void removeFromOrder(long id) {
        productsInOrderRepository.deleteById(id);
    }

    @Override
    public List<ProductsInOrder> getProductsFromOrder(long id) {
        Order order = orderRepository.findById(id).get();
        List<ProductsInOrder> productsInOrders = order.getProductsInOrders();
//        List<Product> result = new ArrayList<>();
//        for (ProductsInOrder productsInOrder : productsInOrders ){
//            result.add(productsInOrder.getProduct());
//        }
        return productsInOrders;

    }

}
