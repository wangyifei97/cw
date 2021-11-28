package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr05
 * @author: 王一飞
 * @createDate: 2021-11-25 8:18 下午
 * @description: 单例05：静态内部类
 */
public class Mgr05 {
    private Mgr05() {
    }

    ;

    public static Mgr05 getInstance() {
        return Mgr05Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }
    }

    private static class Mgr05Holder {
        private final static Mgr05 INSTANCE = new Mgr05();
    }
}
