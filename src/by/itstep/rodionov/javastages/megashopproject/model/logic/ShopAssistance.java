package by.itstep.rodionov.javastages.megashopproject.model.logic;

import by.itstep.rodionov.javastages.megashopproject.model.entity.container.Basket;

public class ShopAssistance {
    private ShopAssistance(){ }

    public static double calculateTotalPrice(Basket basket) {
        double total = 0;

        for (int i = 0; i < basket.getProductCount(); i++) {
            total += basket.getProduct(i).getPrice();
        }

        return total;
    }
}