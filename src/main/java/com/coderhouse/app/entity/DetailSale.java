package com.coderhouse.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;

}
