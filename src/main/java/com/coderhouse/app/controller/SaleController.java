package com.coderhouse.app.controller;

import com.coderhouse.app.dto.SaleDetailDto;
import com.coderhouse.app.dto.SaleDto;
import com.coderhouse.app.entity.DetailSale;
import com.coderhouse.app.entity.Person;
import com.coderhouse.app.entity.Sale;
import com.coderhouse.app.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@ResponseBody
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    SaleService saleService;

    @GetMapping("/{id}")
    public ResponseEntity<Sale> findSaleById(@PathVariable(name = "id")long id){
        return new ResponseEntity<>(saleService.findSaleById(id), HttpStatus.ACCEPTED);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<SaleDetailDto>findDetailSale(@PathVariable(name = "id")long id){
        return new ResponseEntity<>(saleService.findDetailSale(id), HttpStatus.ACCEPTED);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Sale> updateSaleById(@PathVariable(name = "id") long id, @RequestBody Sale sale){
        return new ResponseEntity<>(this.saleService.updateSaleById(id, sale), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Sale> createSale(@RequestBody Sale sale){
        return new ResponseEntity<>(this.saleService.createSale(sale), HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Sale> deleteSaleById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(saleService.deleteSaleById(id), HttpStatus.ACCEPTED);
    }
}
