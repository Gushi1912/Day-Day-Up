package com.gushi.okhttp.controller;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
  import java.util.Set;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/3/25
 */
@Slf4j
@RestController
@RequestMapping("/okhttp")
public class OkHttpDemoController {

    @GetMapping("/test")
    public String getObject() throws IOException {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder().url("http://www.baidu.com").build();
        Response execute = null;
        try {
            execute = httpClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //.string()已经将流中的内容读取出来了，流中的数据不能重复读取
        String string = execute.body().string();
//        log.info("String = {}",string);
        Headers headers = execute.headers();
        Set<String> names = headers.names();
        for (String name : names) {
            String s = headers.get(name);
            log.info("{name = {},value = {}}",name,s);
        }
        byte[] bytes = new byte[4096];
        int len = 0;
        String s = null;
        InputStream inputStream = execute.body().byteStream();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((len = inputStream.read(bytes)) != -1) {
             s = new String(bytes);
            log.info("输出：{}",s);
        }
        return s;
    }
}
