package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/1 14:55.
 */

@Data
public class RedisModel implements Serializable {
    private String redisKey;//redis中的key
    private String name;//姓名
    private String tel;//电话
    private String address;//住址public class RedisModel {
}
