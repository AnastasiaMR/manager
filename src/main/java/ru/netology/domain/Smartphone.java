package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Smartphone extends Product{
    private  String maker;

    public Smartphone(int id, String name, int price, String maker) {
        super( id, name, price );
        this.maker = maker;
    }
}
