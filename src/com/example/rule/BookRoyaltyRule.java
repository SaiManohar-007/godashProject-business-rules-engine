package com.example.rule;

import com.example.model.Payment;

public class BookRoyaltyRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment.getOrderType() == Payment.OrderType.BOOK;
    }

    public void execute(Payment payment) {
        System.out.println("Generating duplicate packing slip for royalty department: " + payment.getProductName());
    }
}