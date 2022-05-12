package by.itstep.rodionov.javastages.megashopproject.model.logic.sortstrategy;

import by.itstep.rodionov.javastages.megashopproject.model.entity.abstracts.Product;

public interface ProductSortable {
    boolean compare(Product pr1, Product pr2);
}
