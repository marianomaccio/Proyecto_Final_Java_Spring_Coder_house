package com.coderhouse.app.service;

import com.coderhouse.app.dto.DetailSaleDto;
import com.coderhouse.app.entity.DetailSale;
import com.coderhouse.app.repository.DetailSaleRepository;
import com.coderhouse.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DetailSaleService {
    @Autowired
    DetailSaleRepository detailSaleRepository;

    @Autowired
    ProductRepository productRepository;

    public DetailSaleDto findDetailSaleById(long id) {
        DetailSale detailSale = detailSaleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Detail Sale"));
        String product = productRepository.findById(detailSale.getProduct().getId()).orElseThrow(() -> new RuntimeException("Invalid Product")).getName();
        DetailSaleDto detailSaleDto = new DetailSaleDto();
        detailSaleDto.setProduct(product);
        detailSaleDto.setQuantity(detailSale.getQuantity());
        detailSaleDto.setPrice(detailSale.getPrice());
        detailSaleDto.setTotalPrice(detailSale.getPrice().multiply(BigDecimal.valueOf(detailSale.getQuantity())));
        detailSaleDto.setId_sale(detailSale.getSale().getId());
        return detailSaleDto;
    }
    public DetailSale updateDetailSaleById(long id, DetailSale detailSale) {
        DetailSale detailSaleResponse = detailSaleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Detail Sale"));
        detailSaleResponse.setQuantity(detailSale.getQuantity());
        detailSaleResponse.setPrice(detailSale.getPrice());
        detailSaleResponse.setProduct(detailSale.getProduct());
        detailSaleResponse.setSale(detailSale.getSale());
        detailSaleRepository.save(detailSaleResponse);
        return detailSaleResponse;
    }

    public DetailSale createDetailSale(DetailSale detailSale) {
        DetailSale detailSaleResponse = new DetailSale();
        detailSaleResponse.setQuantity(detailSale.getQuantity());
        detailSaleResponse.setPrice(detailSale.getPrice());
        detailSaleResponse.setProduct(detailSale.getProduct());
        detailSaleResponse.setSale(detailSale.getSale());
        detailSaleRepository.save(detailSaleResponse);
        return detailSaleResponse;
    }

    public DetailSale deleteDetailSale(long id) {
        DetailSale detailSale = detailSaleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Detail Sale"));
        detailSaleRepository.deleteById(id);
        return detailSale;
    }
}
