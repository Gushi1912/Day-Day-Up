package com.gushi.tacocloud.repository;

import com.gushi.tacocloud.domain.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gushi1912
 * @date 2021/7/4
 */
public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
