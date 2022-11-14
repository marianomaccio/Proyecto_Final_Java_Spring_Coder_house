package com.coderhouse.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "detail_sale")
public class DetailSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detail_sale")
    private long id;

    @Column
    private int quantity;

    @Column
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person person;
}