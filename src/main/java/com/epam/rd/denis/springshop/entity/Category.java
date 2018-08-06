package com.epam.rd.denis.springshop.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Getter @Setter
@EqualsAndHashCode
//@ToString(callSuper=true)
@Entity
@Table(name = "categories")
public class Category {

//    public Category(@NotNull int id, @NotNull CategoryNameEnum name) {
//        this.id = id;
//        this.name = name;
//    }


    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category",cascade = {CascadeType.ALL})
    private List<Product> product;

}
