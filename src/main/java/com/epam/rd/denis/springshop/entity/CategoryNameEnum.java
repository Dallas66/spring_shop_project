package com.epam.rd.denis.springshop.entity;

public enum CategoryNameEnum {

    FIRST_CAT ("Категория товаров 1"),
    SECOND_CAT ("Категория товаров 2"),
    THIRD_CAT ("Категория товаров 3");

    private final String name;

    private CategoryNameEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
