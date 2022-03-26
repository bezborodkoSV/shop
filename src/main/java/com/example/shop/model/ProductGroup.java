package com.example.shop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "group_product")
public class ProductGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nameGroup;
    @Column
    private String groupDescription;

    @OneToMany(mappedBy = "productGroup", orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

}
