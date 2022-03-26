package com.example.shop.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank(message = "Product title cunt be empty")
    private String productTitle;
    @Column
    @NotBlank(message = "Product description cunt be empty")
    private String description;
    @Column
    private String group;
    @Column
    @NotNull(message = "Product description cunt be empty")
    private float cost;
    @Column
    private String currency;

    @ManyToOne
    @JoinColumn(name = "product_group_id")
    private ProductGroup productGroup;

}
