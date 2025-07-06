package com.example.rule;

import com.example.model.Payment;

public class MembershipUpgradeRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment.getOrderType() == Payment.OrderType.MEMBERSHIP_UPGRADE;
    }

    public void execute(Payment payment) {
        System.out.println("Applying membership upgrade for: " + payment.getCustomerEmail());
    }
}