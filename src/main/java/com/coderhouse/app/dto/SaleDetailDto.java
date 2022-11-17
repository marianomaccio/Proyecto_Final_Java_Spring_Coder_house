package com.coderhouse.app.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class SaleDetailDto {

    private LocalDate date;

    private Map<String, List<DetailSaleDto>> product = new HashMap<String, List<DetailSaleDto>>();

    private BigDecimal totalPrice;

}
