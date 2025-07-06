package com.example.rule;

import com.example.model.Payment;

public interface BusinessRule {
    boolean isApplicable(Payment payment);
    void execute(Payment payment);
}