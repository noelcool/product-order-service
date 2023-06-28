package com.example.productorderservice.payment;

import com.example.productorderservice.product.DiscountPolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DiscountPolicyTest {

    @Test
    void noneDiscountPolicy() {
        final int price = 1000;
        final int discountPrice = DiscountPolicy.NONE.applyDiscount(price);
        Assertions.assertThat(discountPrice).isEqualTo(price);
    }

    @Test
    void fix_1000_discounted_pricde() {
        final int price = 2000;
        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void over_discounted_price() {
        final int price = 500;
        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        Assertions.assertThat(discountPrice).isEqualTo(0);
    }

}
