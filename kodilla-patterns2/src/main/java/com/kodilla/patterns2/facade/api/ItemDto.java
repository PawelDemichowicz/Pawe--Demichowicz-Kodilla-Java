package com.kodilla.patterns2.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double quantiity;

    public ItemDto(Long productId, double quantiity) {
        this.productId = productId;
        this.quantiity = quantiity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantiity() {
        return quantiity;
    }
}
