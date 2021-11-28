package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr03
 * @author: 王一飞
 * @createDate: 2021-11-25 8:07 下午
 * @description: 单例04：加锁 + 双重检查
 */
public class Mgr04 {
    /**
     * Mgr03的基础上加 双重检查
     * volatile: 没有初始化的时候就会返回，防止指令重排
     */
    private static volatile Mgr04 INSTANCE;

    private Mgr04() {
    }

    public static Mgr04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr04.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr04();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}
