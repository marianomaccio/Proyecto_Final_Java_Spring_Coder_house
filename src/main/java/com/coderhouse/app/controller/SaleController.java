package com.coderhouse.app.controller;

import com.coderhouse.app.dto.SaleDto;
import com.coderhouse.app.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    SaleService saleService;

    @GetMapping("/{id}")
    public ResponseEntity<SaleDto> findSaleById(@PathVariable(name = "id")long id){
        return new ResponseEntity<>(saleService.findSaleById(id), HttpStatus.ACCEPTED);
    }
}
