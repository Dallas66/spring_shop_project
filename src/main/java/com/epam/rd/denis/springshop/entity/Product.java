package com.epam.rd.denis.springshop.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
@EqualsAndHashCode
@Entity(name = "products")
public class Product {
    @NotNull
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(name = "name")
    private String name;
    @Column(name = "img")
    private String img;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany
    private List<ProductsInOrder> productsInOrders;
}
