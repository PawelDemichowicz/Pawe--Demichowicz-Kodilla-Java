package com.kodilla.good.patterns.challenges.FoodToDoor;

public class NoAntibioticsMeat implements Processor{

    public final String name = "No Antibiotics Meat";
    public final String timeDeliver = "Deliver time: two workdays";
    public final String contactProducer = "www.noantibioticsmeat.com";

    @Override
    public OrderDto process(){
        double quantityKG = 1.0;
        getProducts();
        if(quantityKG <= getProducts().get(0).getAvailableQuantity()){
            orderForPayment();
            sendingOrderToProducer();
            confirmOrder();
            return new OrderDto(1,name,true,getProducts());
        }else {
            System.out.println("Products isnt available");
        }
        System.out.println("Please visit our site: " + contactProducer + "\n" + "Greets " + name + " team");
    }



}
