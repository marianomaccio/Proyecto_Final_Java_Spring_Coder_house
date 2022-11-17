package com.coderhouse.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetailSaleDto {

    private String product;

    private int quantity;

    private BigDecimal price;

    private BigDecimal totalPrice;

    private long id_sale;
    @JsonIgnore
    private String item;
}
