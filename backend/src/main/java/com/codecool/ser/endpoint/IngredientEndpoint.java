package com.codecool.ser.endpoint;

import com.codecool.ser.data.IngredientCategory;
import com.codecool.ser.persistence.entity.Ingredient;
import com.codecool.ser.service.IngredientService;
import com.codecool.ser.service.IngredientSwapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ingredients")
public class IngredientEndpoint {
    private final IngredientService ingredientService;
    private final IngredientSwapService ingredientSwapService;

    public IngredientEndpoint(IngredientService ingredientService, IngredientSwapService ingredientSwapService) {
        this.ingredientService = ingredientService;
        this.ingredientSwapService = ingredientSwapService;
    }

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientService.findAll();
    }

    @PostMapping
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/swap/{id}")
    public Ingredient swapByProtein(@PathVariable long id) {
        return ingredientSwapService.swapByProtein(id);
    }

    @GetMapping("/swap/{category}/{id}")
    public List<Ingredient> swapByCategoryAndProtein(@PathVariable("category") IngredientCategory category, @PathVariable("id") long id) {

        Ingredient ingredient = ingredientSwapService.findById(id);
        return ingredientSwapService.swapIngredientByCategoryAndProtein(category, ingredient);
    }
}
