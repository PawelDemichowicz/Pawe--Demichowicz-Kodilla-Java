package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.List;

public class OrderDto {

    private int orderNumber;
    private String producer;
    private boolean confirm;
    private List<Product> productsOrdered;

    public OrderDto(int orderNumber, String producer, boolean confirm, List<Product> productsOrdered) {
        this.orderNumber = orderNumber;
        this.producer = producer;
        this.confirm = confirm;
        this.productsOrdered = productsOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProducer() {
        return producer;
    }

    public boolean getConfirm() {
        return confirm;
    }

    public List<Product> getProductsOrdered() {
        return productsOrdered;
    }
}
