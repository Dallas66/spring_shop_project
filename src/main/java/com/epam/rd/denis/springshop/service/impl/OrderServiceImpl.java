package com.epam.rd.denis.springshop.service.impl;

import com.epam.rd.denis.springshop.dao.OrderRepository;
import com.epam.rd.denis.springshop.dao.ProductRepository;
import com.epam.rd.denis.springshop.dao.ProductsInOrderRepository;
import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.ProductsInOrder;
import com.epam.rd.denis.springshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void removeOrder(long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void editOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Optional<Order> getOrderById(long id) {
        return orderRepository.findById(id);
    }

    @Override
    public void addToOrder(long productId, long orderId,int quantity) {
        Optional<Product> product = productRepository.findById(productId);
        Optional<Order> order = orderRepository.findById(orderId);

        ProductsInOrder productsInOrder = new ProductsInOrder();
        productsInOrder.setOrder(order.orElseGet(Order::new));
        productsInOrder.setProduct(product.orElseGet(Product::new));
        productsInOrder.setQuantity(quantity);
        productsInOrderRepository.save(productsInOrder);

    }

    @Override
    public void removeFromOrder(long productId, long orderId) {
    }

}
