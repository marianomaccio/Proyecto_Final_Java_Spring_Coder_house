package com.coderhouse.app.service;

import com.coderhouse.app.dto.SaleDto;
import com.coderhouse.app.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public SaleDto findSaleById(long id) {
        SaleDto saleDto=new SaleDto();
        return saleDto;
    }
}
