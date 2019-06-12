package com.kodilla.good.patterns.challenges.FoodToDoor;

public class GmoFreeShop implements Processor{

    public final String name = "GMO Free Shop";
    public final String timeDeliver = "Deliver time: two workdays";
    public final String contactProducer = "www.gmofreeshop.com";

    @Override
    public OrderDto process(){
        getProducts();
        if(isOrderAvailable()){
            System.out.println(name);
            payForOrder();
            sendingOrderToProducer();
            confirmOrder();
            supply();
            return new OrderDto(2,name,true, getProducts());
        } else{
            System.out.println("I'am sorry but your order is impossible to execution");
            return  new OrderDto(0,name,false,getProducts());
        }
    }
}
