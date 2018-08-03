package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import com.sun.org.apache.xpath.internal.operations.Or;

public interface OrderDao {

    void addToOrder(Product product);

    void removeFromOrder(Product product);

    Order getOrder();

    void addOrder(Order order);

    void removeOrder(int id);

    Order getOrderByUserId(int id);

    void setUserId(int id);

}
