package com.example.productorderservice.product;

import org.springframework.stereotype.Component;

@Component
public class ProductAdapter implements ProductPort {
    final ProductRepository productRepository;

    ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
