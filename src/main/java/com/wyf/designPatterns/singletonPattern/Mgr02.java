package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr02
 * @author: 王一飞
 * @createDate: 2021-11-25 7:38 下午
 * @description: 单例02
 */
public class Mgr02 {
    /**
     * 懒汉式
     * 虽然达到按需初始化的目的，但却带来线程不安全的问题。
     */
    private static Mgr02 INSTANCE;

    private Mgr02() {
    }

    public static Mgr02 getInstance() {
        if (INSTANCE == null) {
            // 当 第一个线程走到 21行的时候，还没有new
            // 第二个线程就 直接new了
            // 然后第一个线程也new了
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr02.getInstance().hashCode())
            ).start();
        }
    }
}
