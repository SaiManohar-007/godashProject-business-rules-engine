package com.example.rule;

import com.example.model.Payment;

public class CommissionRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment.getOrderType() == Payment.OrderType.PHYSICAL_PRODUCT || 
               payment.getOrderType() == Payment.OrderType.BOOK;
    }

    public void execute(Payment payment) {
        System.out.println("Generating commission payment for agent: " + payment.getProductName());
    }
}