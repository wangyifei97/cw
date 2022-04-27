package com.wyf.redis;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: com.wyf.redis-> CachePenetrate
 * @author: 王一飞
 * @createDate: 2022-04-09 18:46
 * @description: 模拟实现 缓存击穿、穿透、雪崩
 */
public class CachePenetrate {

    private static final Long maxSize = 10000L;
    // hashmap模拟数据库
    private static Map<Long, Map<Long, String>> dbDataList = new HashMap<>();

    public static void main(String[] args) {

    }

    // 初始化数据
    private void initDB() {

    }
}
