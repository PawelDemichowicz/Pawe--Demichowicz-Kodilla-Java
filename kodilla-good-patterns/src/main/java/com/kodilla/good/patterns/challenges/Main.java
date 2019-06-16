package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1, new Products("Moto", "GS", "Suzuki", 10000, 1));
        ProductOrderService productOrderService = new ProductOrderService(new Email(), new Buying(), new DataOrder());
        productOrderService.process(order);

    }
}
