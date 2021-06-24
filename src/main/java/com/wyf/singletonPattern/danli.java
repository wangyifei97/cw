package com.wyf.singletonPattern;

import java.util.HashMap;

/**
/**
 * @author Annlla
 * @since 2021/2/26  17:24
 * @description:
 */
public class danli {

    public static void main(String[] args) {
        /*单例模式是创建型模式之一。*/
        /*单例模式特点：
　　1、单例类只能有一个实例。
　　2、单例类必须自己创建自己的唯一实例。
　　3、单例类必须给所有其他对象提供这一实例

单例模式的应用场景：Windows的Task Manager（任务管理器）；网站的计数器； 多线程的线程池的设计； Web应用的配置对象的读取（由于配置文件是共享的资源）。

单例模式的五种实现方法：

在看实现方法之前，要先了解一些java的知识：1、初始化顺序依次是：
（静态变量、静态初始化块）–>（普通变量、初始化块）–> 构造器；
如果有父类，则顺序是：父类static方法 –> 子类static方法 –> 父类构造方法- -> 子类构造方法 。　　　　　

2、静态变量特点：static变量值在类加载的时候分配空间，以后创建类对象的时候不会重新分配，后面根据需要是可以再次赋值的。公共性，就是说，一个类的静态成员，它是属于大伙的，所有的类对象共享的，不像成员变量是自己的。*/

        HashMap<Object, Object> map = new HashMap<>();
        map.put("1",2);
        map.keySet().forEach(System.err::println);
        map.values().forEach(System.err::println);
    }
}
