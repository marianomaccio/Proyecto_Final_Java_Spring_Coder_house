package com.coderhouse.app.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private long sku;

    @Column
    private int stock;

    @Column
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item item;
}