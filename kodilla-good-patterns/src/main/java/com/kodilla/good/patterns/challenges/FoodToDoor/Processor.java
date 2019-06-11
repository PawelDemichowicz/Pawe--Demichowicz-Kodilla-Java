package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.ArrayList;
import java.util.List;

public interface Processor {

    OrderDto process();

    default List<Product> getProducts(){

        System.out.println("Show list of products from server");
        List<Product> products = new ArrayList<>();
        products.add(new Product("AA","BB","CC",5,2));
        return products;
    }

    default String supply(){
        final String nameSupplier = "Food To Door deliver your order.";
        return nameSupplier;
    }
    default boolean orderIsAvailable(){
        return true;
    }

    default void confirmOrder(){
        System.out.println("Food To Door:" + "\n" + "Confirm your order.");
    }

    default void sendingOrderToProducer(){
        System.out.println("Sending orders to producer.");
    }


    default void orderForPayment(){
        System.out.println("Please pay for your order.");
    }





}
