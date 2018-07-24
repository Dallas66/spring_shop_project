package com.epam.rd.denis.springshop.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Order {
    @NotNull
    private int id;
    private List<Product> orderList;
}
