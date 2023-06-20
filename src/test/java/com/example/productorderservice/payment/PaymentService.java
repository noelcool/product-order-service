package com.example.productorderservice.payment;

import com.example.productorderservice.order.Order;

class PaymentService {

    private final PaymentAdapter paymentPort;

    PaymentService(PaymentAdapter paymentPort) {
        this.paymentPort = paymentPort;
    }

    public void payment(PaymentRequest request) {
        final Order order = paymentPort.getOrder(request.orderId());
        final Payment payment = new Payment(order, request.cardNumber());
        paymentPort.pay(payment.getPrice(), payment.getCardNumber());
        paymentPort.save(payment);
    }
}
