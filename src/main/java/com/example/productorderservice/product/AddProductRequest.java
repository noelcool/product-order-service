package com.example.productorderservice.product;

import org.springframework.util.Assert;

public record AddProductRequest(String name, int price, DiscountPolicy discountPolicy) {
    public AddProductRequest {
        Assert.hasText("상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야합니다.");
        Assert.notNull("할인 정책은 필수입니다.");
    }
}

