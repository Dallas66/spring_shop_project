package com.epam.rd.denis.springshop.dao;

import com.epam.rd.denis.springshop.entity.Order;
import com.epam.rd.denis.springshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

//    void addToOrder(Product product);
//
//    void removeFromOrder(Product product);
//
//    Order getOrder();
//
//    void addOrder(Order order);
//
//    void removeOrder(int id);
//
//    Order getOrderByUserId(int id);
//
//    void setUserId(int id);

}
