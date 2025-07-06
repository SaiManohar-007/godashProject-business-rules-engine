package com.example.model;

public class Payment {
    
    public enum OrderType {
        PHYSICAL_PRODUCT,
        BOOK,
        MEMBERSHIP,
        MEMBERSHIP_UPGRADE,
        VIDEO
    }

    // Attributes
    private OrderType orderType;
    private String productName; 
    private double amount; 
    private String customerEmail; 

    // Constructor
    public Payment(OrderType orderType, String productName, double amount, String customerEmail) {
        this.orderType = orderType;
        this.productName = productName;
        this.amount = amount;
        this.customerEmail = customerEmail;
    }

    // Getters
    public OrderType getOrderType() {
        return orderType;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

   
    @Override
    public String toString() {
        return "Payment{orderType=" + orderType + ", productName='" + productName + "', amount=" + amount + ", customerEmail='" + customerEmail + "'}";
    }
}