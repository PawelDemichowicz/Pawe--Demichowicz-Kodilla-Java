package com.kodilla.good.patterns.challenges;

public class Products {

    private String category;
    private String name;
    private String company;
    private double price;
    private double quantity;

    public Products(String category, String name, String company, double price, double quantity) {
        this.category = category;
        this.name = name;
        this.company = company;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
