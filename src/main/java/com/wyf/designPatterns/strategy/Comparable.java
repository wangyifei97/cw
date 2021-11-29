package com.wyf.designPatterns.strategy;

/**
 * @className: com.wyf.designPatterns.strategy-> Comparable
 * @author: 王一飞
 * @createDate: 2021-11-28 9:05 下午
 * @description: 泛型 比较
 */
public interface Comparable<T> {
    Integer compareTo(T o);
}
