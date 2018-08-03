package com.epam.rd.denis.springshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ProductsInOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "quantity")
    private int quantity;
}
