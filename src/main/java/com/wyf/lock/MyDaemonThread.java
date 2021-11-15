package com.wyf.lock;

import java.util.ArrayList;

/**
 * @Author wangyifei
 * @Date $ $
 * @Param $
 * @return $
 **/
public class MyDaemonThread {

    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.setDaemon(true);
        thread.start();

        //用户线程走完退出后， thread守护线程不会往下走（所以 守护线程打印50次，只打印了一半）
        for (int i = 0; i < 50; i++) {
            System.out.println("main--"+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"--" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

