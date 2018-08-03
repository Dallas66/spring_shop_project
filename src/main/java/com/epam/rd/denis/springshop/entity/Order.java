package com.epam.rd.denis.springshop.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity(name = "orders")
public class Order {
    @NotNull
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(mappedBy = "orders")
    private List<User> user;
    @OneToMany(mappedBy = "orders")
    private List<ProductsInOrder> productsInOrders;
}
