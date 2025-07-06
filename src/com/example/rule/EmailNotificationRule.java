package com.example.rule;

import com.example.model.Payment;

public class EmailNotificationRule implements BusinessRule {
    public boolean isApplicable(Payment payment) {
        return payment != null && "membership".equals(payment.getType());
    }

    public void execute(Payment payment) {
        String email = payment.getCustomerEmail() != null && !payment.getCustomerEmail().isEmpty() ? payment.getCustomerEmail() : "Unknown Email";
        System.out.println("Sending email to " + email + " about membership " + (payment.isUpgrade() ? "upgrade" : "activation"));
    }
}