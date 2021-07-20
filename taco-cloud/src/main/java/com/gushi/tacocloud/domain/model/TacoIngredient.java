package com.gushi.tacocloud.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Gushi1912
 * @date 2021/7/3
 */
@Data
@Entity
@Table(name = "t_taco_ingredient")
public class TacoIngredient {

    private String ingredient;

    @Id
    private Integer taco;
}
