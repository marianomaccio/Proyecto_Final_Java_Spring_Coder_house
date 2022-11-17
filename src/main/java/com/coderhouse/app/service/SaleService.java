package com.coderhouse.app.service;

import com.coderhouse.app.dto.DetailSaleDto;
import com.coderhouse.app.dto.SaleDetailDto;
import com.coderhouse.app.entity.DetailSale;
import com.coderhouse.app.entity.Sale;
import com.coderhouse.app.repository.DetailSaleRepository;
import com.coderhouse.app.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;
    @Autowired
    DetailSaleService detailSaleService;

    public Sale findSaleById(long id) {
        Sale sale = saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Sale"));
        return sale;
    }
    //Obtenemos el detalle de una compra
    public SaleDetailDto findDetailSale(long id) {
        Sale sale = saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Sale"));
        SaleDetailDto detail = new SaleDetailDto();
        detail.setDate(sale.getDate());
        Map<String, List<DetailSaleDto>> product = new HashMap<String, List<DetailSaleDto>>();
        List<DetailSaleDto> listDto = new ArrayList<>();
        sale.getDetailSaleList().stream().forEach(p->listDto.add
                (new DetailSaleDto(p.getProduct().getDescription(),p.getQuantity(),p.getPrice(),p.getPrice().multiply(BigDecimal.valueOf(p.getQuantity())),p.getSale().getId(),p.getProduct().getItem().getDescription())));
                sale.getDetailSaleList().stream()
                .map(p -> p.getProduct().getItem().getDescription())
                .distinct().forEach(p -> product.put(p,listDto.stream().filter(u -> u.getItem().equals(p)).collect(Collectors.toList())));

        detail.setProduct(product);
        detail.setTotalPrice(sale.getPrice());

        return detail;
    }

    public Sale updateSaleById(long id, Sale sale) {
        Sale saleResponse = saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid Sale"));
        saleResponse.setDate(sale.getDate());
        saleResponse.setPrice(sale.getPrice());
        saleResponse.setState(sale.getState());
        saleResponse.setPerson(sale.getPerson());
        saleRepository.save(saleResponse);
        return saleResponse;
    }

    public Sale createSale(Sale sale) {
        Sale saleResponse = new Sale();
        saleResponse.setDate(sale.getDate());
        saleResponse.setPrice(sale.getPrice());
        saleResponse.setState(sale.getState());
        saleResponse.setPerson(sale.getPerson());
        saleRepository.save(saleResponse);
        List<DetailSale> list = new ArrayList<>();
        saleResponse.setDetailSaleList(sale.getDetailSaleList());
        long id = saleResponse.getId();
        sale.getDetailSaleList().stream().forEach(p-> p.getSale().setId(id));
        for ( DetailSale p: sale.getDetailSaleList()) {
            detailSaleService.createDetailSale(p);
        }

        return saleResponse;}


    public Sale deleteSaleById(long id) {
        Sale sale= saleRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Sale")));
        saleRepository.deleteById(id);
        return sale;
    }
}
