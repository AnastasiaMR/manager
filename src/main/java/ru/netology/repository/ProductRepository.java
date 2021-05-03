package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository extends Product {
    private ProductRepository[] items = new ProductRepository[0];
    private ProductRepository item;

    public void save( ) {
        int length = items.length + 1;
        ProductRepository[] tmp = new ProductRepository[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public ProductRepository[] findAll() {
        return items;
    }

    public ProductRepository findById(int id) {
        for (ProductRepository item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        ProductRepository[] tmp = new ProductRepository[length];
        int index = 0;
        for (ProductRepository item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}
