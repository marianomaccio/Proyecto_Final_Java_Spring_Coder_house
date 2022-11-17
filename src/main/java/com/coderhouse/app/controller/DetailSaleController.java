package com.coderhouse.app.controller;

import com.coderhouse.app.dto.DetailSaleDto;
import com.coderhouse.app.entity.DetailSale;
import com.coderhouse.app.service.DetailSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/detail")
public class DetailSaleController {
    @Autowired
    DetailSaleService detailSaleService;

    @GetMapping("/{id}")
    public ResponseEntity<DetailSaleDto> findDetailSaleById(@PathVariable(name = "id")long id){
        return new ResponseEntity<>(detailSaleService.findDetailSaleById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetailSale> updateDetailSaleById(@PathVariable(name = "id")long id, @RequestBody DetailSale detailSale){
        return new ResponseEntity<>(detailSaleService.updateDetailSaleById(id, detailSale), HttpStatus.ACCEPTED);
    }
    @PostMapping
    public ResponseEntity<DetailSale> createDetailSale(@RequestBody DetailSale detailSale){
        return new ResponseEntity<>(detailSaleService.createDetailSale(detailSale), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetailSale> createDetailSale(@PathVariable(name = "id")long id){
        return new ResponseEntity<>(detailSaleService.deleteDetailSale(id), HttpStatus.ACCEPTED);
    }


}
