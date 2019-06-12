package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private BuyService buyService;
    private DataService dataService;

    public ProductOrderService(final InformationService informationService, final BuyService buyService, final DataService dataService) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.dataService = dataService;
    }

    public OrderDto process(Order order){

        boolean isOrder = buyService.confirmOrder(order.getShopUser(), order);

        if(isOrder){
            informationService.sentConfirm(order,order.getShopUser());
            dataService.addStatistics(order.getShopUser(),order);
            return new OrderDto(order.getShopUser(),true);
        } else {
            return new OrderDto(order.getShopUser(),false);
        }
    }
}
