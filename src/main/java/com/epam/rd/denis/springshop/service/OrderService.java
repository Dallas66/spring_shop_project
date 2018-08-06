package com.epam.rd.denis.springshop.service;

import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import com.epam.rd.denis.springshop.entity.ProductsInOrder;
import com.epam.rd.denis.springshop.entity.User;
import org.aspectj.weaver.ast.Or;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void addOrder(Order order);
    void addOrderWithUser(User user);
    void removeOrder(long id);
    void editOrder(Order order);
    Order getOrderById(long id);

    void addToOrder(long productId, Order order, int quantity);
    void removeFromOrder(long id);
    List<ProductsInOrder> getProductsFromOrder(long id);

}
