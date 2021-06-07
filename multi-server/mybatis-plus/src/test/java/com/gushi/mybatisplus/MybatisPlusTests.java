package com.gushi.mybatisplus;

import com.gushi.mybatisplus.mapper.CertBizMapper;
import com.gushi.mybatisplus.model.entity.CertBiz;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/4/6
 */
@SpringBootTest
public class MybatisPlusTests {

    @Autowired
    private CertBizMapper certBizMapper;

    @Test
    public void test1() {
        List<CertBiz> certBizList = certBizMapper.selectList(null);

        certBizList.forEach(System.out::println);
    }
}
