package com.coderhouse.app.controller;

import com.coderhouse.app.dto.ProductDto;
import com.coderhouse.app.entity.Product;
import com.coderhouse.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findProductById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(this.productService.findProductById(id), HttpStatus.ACCEPTED);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable(name = "id") long id, @RequestBody Product product){
        return new ResponseEntity<>(this.productService.updateProductById(id, product), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(this.productService.createProduct(product), HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable(name = "id") long id) {
        return new ResponseEntity<>(productService.deleteProductById(id), HttpStatus.ACCEPTED);

    }
}
