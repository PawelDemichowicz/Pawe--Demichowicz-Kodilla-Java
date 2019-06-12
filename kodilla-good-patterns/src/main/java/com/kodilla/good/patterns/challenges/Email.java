package com.kodilla.good.patterns.challenges;

public class Email implements InformationService{

    @Override
    public void sentConfirm(Order order, ShopUser shopUser){

        System.out.println("Confirm your order.");
    }
}
