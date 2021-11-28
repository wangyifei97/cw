package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr06
 * @author: 王一飞
 * @createDate: 2021-11-25 8:38 下午
 * @description: 单例05：枚举
 */
public enum Mgr06 {
    /**
     * 不仅可以解决线程同步，还可以防止反序列化
     * <p>
     * 防止反序列化：没有构造方法
     * 解决线程同步：反编译后 所有属性都被 static final 修饰，天然支持多线程
     * static 类型的属性会在类加载过程初始化，
     * 当一个 Java 类第一次被真正使用到的时候静态资源被初始化、
     * Java 类的加载和初始化过程都是线程安全的
     * （ 因为虚拟机在加载枚举的类的时候， 会使用 ClassLoader 的 loadClass 方法，
     * 而这个方法使用同步代码块保证了线程安全） 。
     */
    INSTANCE;


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr06.INSTANCE.hashCode())
            ).start();
        }
    }
}
