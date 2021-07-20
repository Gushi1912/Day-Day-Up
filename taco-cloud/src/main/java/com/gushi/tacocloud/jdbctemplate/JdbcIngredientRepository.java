package com.gushi.tacocloud.jdbctemplate;

import com.gushi.tacocloud.domain.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Gushi1912
 * @date 2021/6/26
 */
@Repository
public class JdbcIngredientRepository implements IngredientRepository{

    private JdbcTemplate jdbc;

    //将jdbcTemplate注入到方法参数中
    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }


    @Override
    public Iterable<Ingredient> findAll() {
        return jdbc.query("select id,name,type from t_ingredient",this::mapRowToIngredient);
    }

    @Override
    public Ingredient findOne(String id) {
        return jdbc.queryForObject("seeclt id,name,type from t_ingredient where id = ?",this::mapRowToIngredient,id);
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        int update = jdbc.update("insert into t_ingredient (id,name,type) values (?,?,?)",
                ingredient.getId(), ingredient.getName(), ingredient.getType());
        System.out.println(update);
        return ingredient;
    }

    public Ingredient mapRowToIngredient(ResultSet set, int rowNum) throws SQLException {
        return new Ingredient(
                set.getString("id"),
                set.getString("name"),
                Ingredient.Type.valueOf(set.getString("type")));
    }
}
