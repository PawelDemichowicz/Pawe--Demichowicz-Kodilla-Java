package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.ArrayList;
import java.util.List;

public interface Processor {

    OrderDto process();

    default List<Product> getProducts(){

        List<Product> products = new ArrayList<>();
        products.add(new Product("AA","BB","CC",5,1));
        return products;
    }

    default void supply(){
        System.out.println("Food To Door will deliver your order.");
    }
    default boolean isOrderAvailable(){
        return true;
    }

    default void confirmOrder(){
        System.out.println("Food To Door: Confirm your order.");
    }

    default void sendingOrderToProducer(){
        System.out.println("Sending orders to producer.");
    }


    default void payForOrder(){
        System.out.println("Please pay for your order.");
    }





}
