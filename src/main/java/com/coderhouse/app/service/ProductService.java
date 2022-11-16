package com.coderhouse.app.service;

import com.coderhouse.app.dto.ProductDto;
import com.coderhouse.app.entity.Item;
import com.coderhouse.app.entity.Product;
import com.coderhouse.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public ProductDto findProductById(long id) {
        Product product= productRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Product")));
        Item item = product.getItem();
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setSku(product.getSku());
        productDto.setStock(product.getStock());
        productDto.setPrice(product.getPrice());
        productDto.setItem(item.getDescription());

        return productDto;
    }
    public Product updateProductById(long id, Product product) {

        Product productResponse = productRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Product")));
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setSku(product.getSku());
        productResponse.setStock(product.getStock());
        productResponse.setPrice(product.getPrice());
        productResponse.setItem(product.getItem());
        productRepository.save(productResponse);
        return productResponse;
    }

    public Product createProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    public Product deleteProductById(long id) {
        Product product= productRepository.findById(id).orElseThrow(()->(new RuntimeException("Invalid Product")));
        productRepository.deleteById(id);
        return product;}

}
