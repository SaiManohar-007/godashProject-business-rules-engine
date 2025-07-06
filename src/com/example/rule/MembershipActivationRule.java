package com.example.rule;

import com.example.model.Payment;

public class MembershipActivationRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment.getOrderType() == Payment.OrderType.MEMBERSHIP;
    }

    public void execute(Payment payment) {
        System.out.println("Activating membership for: " + payment.getCustomerEmail());
    }
}