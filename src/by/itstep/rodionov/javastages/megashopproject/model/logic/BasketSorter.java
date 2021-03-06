package by.itstep.rodionov.javastages.megashopproject.model.logic;

import by.itstep.rodionov.javastages.megashopproject.model.entity.abstracts.Product;
import by.itstep.rodionov.javastages.megashopproject.model.entity.container.Basket;
import by.itstep.rodionov.javastages.megashopproject.model.logic.sortstrategy.ProductSortable;

public class BasketSorter {
    public static void sort(Basket basket, ProductSortable sortable) {
        for (int i = 0; i < basket.getProductCount() - 1; i++) {
            for (int j = 0; j < basket.getProductCount() - 1 - i; j++) {
                if (sortable.compare(basket.getProduct(j), basket.getProduct(j + 1))) {
                    Product temp = basket.getProduct(j);
                    basket.setProduct(j, basket.getProduct(j + 1));
                    basket.setProduct(j + 1, temp);
                }
            }
        }
    }
}
