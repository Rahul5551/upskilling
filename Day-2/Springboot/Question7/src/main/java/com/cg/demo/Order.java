package com.cg.demo;

import org.springframework.data.mongodb.core.mapping.Document;

 

@Document("orderDetail")
public class Order {
    
    private String id;
    private String orderName;
    private String orderPrice;
    private String paymentStatus;
    public Order(String id, String orderName, String orderPrice, String paymentStatus) {
        super();
        this.id = id;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
        this.paymentStatus = paymentStatus;
    }
    public String getId() {
        return id;
    }
    public String getOrderName() {
        return orderName;
    }
    public String getOrderPrice() {
        return orderPrice;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

 

}