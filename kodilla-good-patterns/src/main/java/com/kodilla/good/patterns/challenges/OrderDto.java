package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public ShopUser shopUser;
    public boolean isOrder;

    public OrderDto(ShopUser shopUser, boolean isOrder) {
        this.shopUser = shopUser;
        this.isOrder = isOrder;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
