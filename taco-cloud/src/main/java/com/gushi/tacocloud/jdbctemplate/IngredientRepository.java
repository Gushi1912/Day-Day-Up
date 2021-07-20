package com.gushi.tacocloud.jdbctemplate;

import com.gushi.tacocloud.domain.model.Ingredient;

/**
 * @author Gushi1912
 * @date 2021/6/26
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
