package com.example.rule;

import com.example.model.Payment;

public class ShippingSlipRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment != null && payment.getOrderType() == Payment.OrderType.PHYSICAL_PRODUCT;
    }

    public void execute(Payment payment) {
        String productName = payment.getProductName() != null ? payment.getProductName() : "Unknown Product";
        System.out.println("Generating packing slip for shipping: " + productName);
    }
}