package com.epam.rd.denis.springshop.dao.impl;

import com.epam.rd.denis.springshop.dao.OrderDao;
import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    private List<Order> orderRepository = new ArrayList<>();
    private Order order;


    public OrderDaoImpl() {
        List<Product> prodtestlist = new ArrayList<>();
        order = new Order();
        order.setId(1);
        order.setProductList(prodtestlist);

    }

    @Override
    public void addToOrder(Product product) {
        order.getProductList().add(product);
    }

    @Override
    public void removeFromOrder(Product product) {
        order.getProductList().remove(product);
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.add(order);
    }

    @Override
    public void removeOrder(int id) {
        Order order = orderRepository.stream().filter(order1 -> order1.getId() == id).findFirst().orElse(null);
        orderRepository.remove(order);
    }

    @Override
    public Order getOrderByUserId(int id) {
        return orderRepository.stream().filter(order -> order.getUserId() == id).findFirst().orElse(null);
    }

    @Override
    public void setUserId(int id) {
        order.setUserId(id);
    }
}
