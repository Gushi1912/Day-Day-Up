package com.gushi.tacocloud;

import com.gushi.tacocloud.domain.model.Taco;
import com.gushi.tacocloud.repository.TacoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = TacoCloudApplication.class)
class TacoCloudApplicationTests {

    @Autowired
    private TacoRepository tacoRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        Taco gugugu = tacoRepository.findByNameOrderByCreateTime("gugugu");
        System.out.println(gugugu);
    }
}
