package com.coderhouse.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne
    @JoinColumn(name = "id_person")
    private Person person;
    @JsonIgnore
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<DetailSale> detailSaleList;
}
