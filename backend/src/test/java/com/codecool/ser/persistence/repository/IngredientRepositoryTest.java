package com.codecool.ser.persistence.repository;

import com.codecool.ser.data.IngredientCategory;
import com.codecool.ser.persistence.entity.Ingredient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class IngredientRepositoryTest {

    @Autowired
    TestEntityManager entityManager;
    @Autowired
    IngredientRepository ingredientRepository;

    @AfterEach
    void after(){
        ingredientRepository.deleteAll();
    }

    @Test
    void findByCategoryAndProteinIsBetween() {
        Ingredient first = new Ingredient("Pineapple", 10, IngredientCategory.FRUIT);
        entityManager.persist(first);
        Ingredient second = new Ingredient("Grape", 5, IngredientCategory.FRUIT);
        entityManager.persist(second);
        Ingredient third = new Ingredient("Chicken", 25, IngredientCategory.MEAT);
        entityManager.persist(third);
        Ingredient fourth = new Ingredient("Cow", 30, IngredientCategory.MEAT);
        entityManager.persist(fourth);
        Ingredient fifth = new Ingredient("Snake", 6, IngredientCategory.MEAT);
        entityManager.persist(fifth);

        List<Ingredient> ingredient = ingredientRepository.findByCategoryAndProteinIsBetween(IngredientCategory.MEAT, 5, 30);

    }
}