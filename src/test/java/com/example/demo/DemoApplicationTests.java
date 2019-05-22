package com.example.demo;

import com.example.demo.Service.impl.RedisServiceImpl;
import com.example.demo.model.RedisModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisServiceImpl service;


    @Test
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void setInfo() {
        System.out.println("start.....");
        RedisModel m = new RedisModel();
        m.setName("张三");
        m.setTel("1111");
        m.setAddress("深圳1");
        m.setRedisKey("zhangsanKey01");
        service.put(m.getRedisKey(), m, -1);

        RedisModel m2 = new RedisModel();
        m2.setName("张三2");
        m2.setTel("2222");
        m2.setAddress("深圳2");
        m2.setRedisKey("zhangsanKey02");
        service.put(m2.getRedisKey(), m2, -1);

        RedisModel m3 = new RedisModel();
        m3.setName("张三3");
        m3.setTel("2222");
        m3.setAddress("深圳2");
        m3.setRedisKey("zhangsanKey03");
        service.put(m3.getRedisKey(), m3, -1);

        System.out.println("add success end...");
    }

    //查询所有对象
    @Test
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public void getAll() {
        service.getAll();
    }

    //删除
    @Test
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    @ResponseBody
    public void remove() {
        RedisModel m = new RedisModel();
        m.setRedisKey("zhangsanKey01");
        service.remove(m.getRedisKey());
    }

    //清空
    @Test
    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    @ResponseBody
    public void empty() {
        service.empty();
    }
}





