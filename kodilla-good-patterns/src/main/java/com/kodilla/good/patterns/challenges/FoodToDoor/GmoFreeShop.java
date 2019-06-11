package com.kodilla.good.patterns.challenges.FoodToDoor;

public class GmoFreeShop implements Processor{

    public final String name = "GMO Free Shop";
    public final String timeDeliver = "Deliver time: two workdays";
    public final String contactProducer = "www.gmofreeshop.com";

    @Override
    public OrderDto process(){
        double quantityKG = 1.0;
        getProducts();
        if(orderIsAvailable()){
            orderForPayment();
            sendingOrderToProducer();
            confirmOrder();
            return new OrderDto(2,name,true,getProducts());
        } else{
            System.out.println("I'am sorry but your order is impossible to execution");
        }
        System.out.println("Please visit our site: " + contactProducer + "\n" + "Greets " + name + " team");
    }
}
