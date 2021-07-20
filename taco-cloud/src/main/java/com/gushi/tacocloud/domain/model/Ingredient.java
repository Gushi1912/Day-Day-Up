package com.gushi.tacocloud.domain.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Gushi1912
 * @date 2021/1/28
 */
@Data
@Entity
@RequiredArgsConstructor
//将无参构造器设为私有的
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@Table(name = "t_ingredient")
public class Ingredient {
    //指定为数据库中唯一标识该实体的属性
    @Id
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
