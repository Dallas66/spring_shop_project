package com.epam.rd.denis.springshop.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode
@Entity(name = "categories")
public class Category {

//    public Category(@NotNull int id, @NotNull CategoryNameEnum name) {
//        this.id = id;
//        this.name = name;
//    }

    @NotNull
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private CategoryNameEnum name;
    @OneToMany(mappedBy = "categories")
    private List<Product> products;

}
