package com.epam.rd.denis.springshop.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String img;
    private String description;
    private int price;
}
