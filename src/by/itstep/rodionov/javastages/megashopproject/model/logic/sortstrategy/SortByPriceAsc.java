package by.itstep.rodionov.javastages.megashopproject.model.logic.sortstrategy;

import by.itstep.rodionov.javastages.megashopproject.model.entity.abstracts.Product;

public class SortByPriceAsc implements ProductSortable {
    @Override
    public boolean compare(Product pr1, Product pr2) {
        return pr1.getPrice() > pr2.getPrice();
    }
}
