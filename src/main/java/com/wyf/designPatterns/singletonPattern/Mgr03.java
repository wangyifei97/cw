package com.wyf.designPatterns.singletonPattern;

/**
 * @className: com.wyf.designPatterns.singletonPattern-> Mgr03
 * @author: 王一飞
 * @createDate: 2021-11-25 8:07 下午
 * @description: 单例03：加锁
 */
public class Mgr03 {
    /**
     * Mgr02的基础上加锁
     */
    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static synchronized Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}
