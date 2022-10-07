package com.codecool.ser.persistence.entity;


import com.codecool.ser.data.IngredientCategory;
import lombok.*;

import javax.persistence.*;


@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Ingredient {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int protein;
    @Enumerated(value = EnumType.STRING)
    private IngredientCategory category;

    public Ingredient(String name, int protein, IngredientCategory category) {
        this.name = name;
        this.protein = protein;
        this.category = category;
    }
}
