package com.kodilla.good.patterns.challenges.FoodToDoor;

public class Product {

    private String producer;
    private String category;
    private String name;
    private double price;
    private double availableQuantity;

    public Product(String producer,String category, String name, int price, double availableQuantity) {
        this.producer = producer;
        this.category = category;
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getProducer() {
        return producer;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }
}
