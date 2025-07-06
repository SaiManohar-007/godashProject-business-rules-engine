package com.example.rule;

import com.example.model.Payment;

public class FreeVideoRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment.getOrderType() == Payment.OrderType.VIDEO && 
               "Learning to Ski".equals(payment.getProductName());
    }

    public void execute(Payment payment) {
        System.out.println("Adding free 'First Aid' video to packing slip for: " + payment.getProductName());
    }
}