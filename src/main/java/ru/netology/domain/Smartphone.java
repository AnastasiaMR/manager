package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)


public class Smartphone extends Product{
    private  String maker;

    public Smartphone(String maker) {
        this.maker = maker;
    }

    public Smartphone(int id, String name, int price, String maker) {
        super( id, name, price );
        this.maker = maker;
    }
}
