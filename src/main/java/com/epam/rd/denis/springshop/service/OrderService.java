package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.Order;

import java.util.Optional;

public interface OrderService {

    void addOrder(Order order);
    void removeOrder(long id);
    void editOrder(Order order);
    Optional<Order> getOrderById(long id);

    void addToOrder(long productId, long orderId,int quantity);
    void removeFromOrder(long productId, long orderId);

}
