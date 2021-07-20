package com.gushi.tacocloud.repository;

import com.gushi.tacocloud.domain.model.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gushi1912
 * @date 2021/7/4
 */
public interface TacoRepository extends CrudRepository<Taco,Integer> {

    //自定义的crud操作
    Taco findByNameOrderByCreateTime(String name);
}
