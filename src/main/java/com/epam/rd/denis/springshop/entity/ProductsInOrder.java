package com.epam.rd.denis.springshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "productsInOrder")
public class ProductsInOrder {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
