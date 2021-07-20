package com.gushi.tacocloud.controller;

import com.gushi.tacocloud.domain.model.Ingredient;
import com.gushi.tacocloud.domain.model.Taco;
import com.gushi.tacocloud.jdbctemplate.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gushi.tacocloud.domain.model.Ingredient.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gushi1912
 * @date 2021/1/28
 */
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/")
    public String showDesignForm(Model model) {
//        List<Ingredient> ingredients = Arrays.asList(
//                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
//                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
//                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
//                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
//                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
//                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
//                new Ingredient("CHED", "Cheddar", Type.CHEESE),
//                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
//                new Ingredient("SLSA", "Salsa", Type.SAUCE),
//                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
//        );
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredientRepository.findAll().forEach(i -> ingredients.add(i));
        Type[] values = Type.values();
        for (Type type : values) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients,type));
        }
        model.addAttribute("design",new Taco());
        return "design";
    }

    @PostMapping("/")
    public String processDesign(Taco design) {
        log.info("Processing design: {}" , design);
        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients.stream().filter(
                x -> x.getType().equals(type)
        ).collect(Collectors.toList());
    }
}
