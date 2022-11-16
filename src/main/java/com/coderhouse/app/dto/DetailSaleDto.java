package com.coderhouse.app.dto;

import com.coderhouse.app.entity.Product;
import com.coderhouse.app.entity.Sale;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
public class DetailSaleDto {

    private String product;

    private int quantity;

    private BigDecimal price;

    private BigDecimal totalPrice;

    private long id_sale;
}
