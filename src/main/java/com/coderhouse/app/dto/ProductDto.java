package com.coderhouse.app.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductDto {

    private String name;

    private String description;

    private long sku;

    private int stock;

    private BigDecimal price;

    private String item;
}
