package com.kodilla.good.patterns.challenges;

public class Order {

    private ShopUser shopUser;
    private int numberOrder;
    private Products products;

    public Order(int numberOrder, Products products) {
        this.numberOrder = numberOrder;
        this.products = products;
    }
    public int getNumberOrder() {
        return numberOrder;
    }

    public Products getProducts() {
        return products;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }
}
