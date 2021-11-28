package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr01
 * @author: 王一飞
 * @createDate: 2021-11-25 7:21 下午
 * @description: 单例01
 */
public class Mgr01 {
    /**
     * 饿汉式
     * 类加载到内存后，就实例化一个单例，JVM保证线程安全
     * <p>
     * 唯一缺点：不管用到与否，类装载时就完成实例化
     * （话说你不用，装载它干嘛）
     */
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = new Mgr01();
        Mgr01 mgr02 = new Mgr01();
        System.out.println(mgr01 == mgr02);

        Mgr01 instance01 = Mgr01.getInstance();
        Mgr01 instance02 = Mgr01.getInstance();
        System.out.println(instance01 == instance02);

        /**
         * 运行结果：
         * false
         * true
         */
    }
}
