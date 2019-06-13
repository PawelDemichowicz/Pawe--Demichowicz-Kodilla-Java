package com.kodilla.good.patterns.challenges.FoodToDoor;

public class NoAntibioticsMeat extends Processor{

    public final String name = "No Antibiotics Meat";

    @Override
    public OrderDto process(){          //Processing order in shop
        double quantityKG = 1.0;
        getProducts();
        System.out.println(name);
        if(quantityKG <= getProducts().get(0).getAvailableQuantity()){
            payForOrder();
            sendingOrderToProducer();
            confirmOrder();
            supply();
            return new OrderDto(1,name,true,getProducts());
        }else {
            System.out.println("Products isnt available");
            return new OrderDto(0, name, false, getProducts());
        }
    }



}
