package com.wyf.designPatterns.strategy;

/**
 * @className: com.wyf.designPatterns.strategy-> ComparableTest
 * @author: 王一飞
 * @createDate: 2021-11-28 9:05 下午
 * @description: 测试 泛型 比较
 */
public class ComparableTest implements Comparable<ComparableEntity> {

    @Override
    public Integer compareTo(ComparableEntity entity) {
        return entity.temp > 0 ? 1 : 0;
    }
}
