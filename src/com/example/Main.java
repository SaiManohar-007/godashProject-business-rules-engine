package com.example;

import com.example.model.Payment;
import com.example.model.Payment.OrderType;
import com.example.engine.BusinessRulesEngine;
import com.example.rule.ShippingSlipRule;
import com.example.rule.BookRoyaltyRule;
import com.example.rule.MembershipActivationRule;
import com.example.rule.MembershipUpgradeRule;
import com.example.rule.EmailNotificationRule;
import com.example.rule.FreeVideoRule;
import com.example.rule.CommissionRule;

public class Main {
    public static void main(String[] args) {
        BusinessRulesEngine engine = new BusinessRulesEngine();
        engine.addRule(new ShippingSlipRule());
        engine.addRule(new BookRoyaltyRule());
        engine.addRule(new MembershipActivationRule());
        engine.addRule(new MembershipUpgradeRule());
        engine.addRule(new EmailNotificationRule());
        engine.addRule(new FreeVideoRule());
        engine.addRule(new CommissionRule());

        System.out.println("=== Normal Cases ===");
        Payment physicalProduct = new Payment(OrderType.PHYSICAL_PRODUCT, "Laptop", 999.99, "customer@example.com");
        System.out.println("Processing Physical Product:");
        engine.processPayment(physicalProduct);

        Payment book = new Payment(OrderType.BOOK, "Java Programming", 29.99, "customer@example.com");
        System.out.println("\nProcessing Book:");
        engine.processPayment(book);

        Payment membership = new Payment(OrderType.MEMBERSHIP, "Premium Membership", 49.99, "member@example.com");
        System.out.println("\nProcessing Membership:");
        engine.processPayment(membership);

        Payment upgrade = new Payment(OrderType.MEMBERSHIP_UPGRADE, "Premium Plus", 79.99, "member@example.com");
        System.out.println("\nProcessing Membership Upgrade:");
        engine.processPayment(upgrade);

        Payment video = new Payment(OrderType.VIDEO, "Learning to Ski", 19.99, "customer@example.com");
        System.out.println("\nProcessing Video:");
        engine.processPayment(video);

        System.out.println("\n=== Edge Cases ===");
        System.out.println("Processing Null Payment:");
        engine.processPayment(null);

        Payment nullProductName = new Payment(OrderType.PHYSICAL_PRODUCT, null, 999.99, "customer@example.com");
        System.out.println("\nProcessing Physical Product with Null Product Name:");
        engine.processPayment(nullProductName);

        Payment emptyEmail = new Payment(OrderType.MEMBERSHIP, "Premium Membership", 49.99, "");
        System.out.println("\nProcessing Membership with Empty Email:");
        engine.processPayment(emptyEmail);
    }
}