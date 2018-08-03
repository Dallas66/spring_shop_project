package com.epam.rd.denis.springshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Category {

    public Category(@NotNull int id, @NotNull CategoryNameEnum name) {
        this.id = id;
        this.name = name;
    }

    @NotNull
    private int id;
    @NotNull
    private CategoryNameEnum name;
    private List<Product> prodList;

}
