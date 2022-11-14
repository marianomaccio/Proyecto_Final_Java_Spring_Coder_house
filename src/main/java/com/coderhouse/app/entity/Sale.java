package com.coderhouse.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sale")
    private long id;

    @Column
    private LocalDate date;

    @Column
    private BigDecimal price;

    @Column
    private String state;

    @OneToMany(mappedBy = "sale")
    private List<DetailSale> detailSaleList;
}
