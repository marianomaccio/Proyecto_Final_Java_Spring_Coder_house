package com.coderhouse.app.dto;

import com.coderhouse.app.entity.DetailSale;
import com.coderhouse.app.entity.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class SaleDto {
    private LocalDate date;

    private BigDecimal price;

    private String state;

    private Person person;

    private List<DetailSale> detailSaleList;
}
