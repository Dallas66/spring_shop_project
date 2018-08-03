package com.epam.rd.denis.springshop.entity;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class Product {
    @NotNull
    private int id;
    @NotNull
    private String name;
    private String img;
    private String description;
    private int price;
    private CategoryNameEnum catName;
}
