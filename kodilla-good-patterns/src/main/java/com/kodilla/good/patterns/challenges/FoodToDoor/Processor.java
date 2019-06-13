package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.ArrayList;
import java.util.List;

public abstract class Processor {

    public abstract OrderDto process();

    public List<Product> getProducts(){

        List<Product> products = new ArrayList<>();
        products.add(new Product("AA","BB","CC",5,1));
        return products;
    }

    public void supply(){
        System.out.println("Food To Door will deliver your order.");
    }
    public boolean isOrderAvailable(){
        return true;
    }

    public void confirmOrder(){
        System.out.println("Food To Door: Confirm your order.");
    }

    public void sendingOrderToProducer(){
        System.out.println("Sending orders to producer.");
    }


    public void payForOrder(){
        System.out.println("Please pay for your order.");
    }





}
