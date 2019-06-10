package com.kodilla.good.patterns.challenges;

public class Buying implements BuyService{

    @Override
    public boolean confirmOrder(ShopUser shopUser, Order order){
        return true;
    }

}
