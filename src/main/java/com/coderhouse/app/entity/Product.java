package com.coderhouse.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<DetailSale> detailSaleList;

}