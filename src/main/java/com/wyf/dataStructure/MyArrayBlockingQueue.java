package com.wyf.dataStructure;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;

/**
 * @Author wangyifei
 * @Date $ $
 * @Param $
 * @return $
 **/
public class MyArrayBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

        //放入数据
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(200);
                    System.out.println("线程" + Thread.currentThread().getName() + "准备放入数据");
                    blockingQueue.offer(new Random().nextInt(100));
                    System.out.println("线程" + Thread.currentThread().getName() + "已经放入数据，目前队列有" + blockingQueue.size() + "个数据");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            try {
                thread.start();
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //打印
        System.err.println(Arrays.toString(blockingQueue.stream().collect(Collectors.toList()).toArray()));

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(200);
                    System.out.println("线程" + Thread.currentThread().getName() + " 准备取数据了");
                    Integer take = blockingQueue.take();
                    System.out.println("线程" + Thread.currentThread().getName() + " 已经取完数据了" + take + ",目前队列有" + blockingQueue.size() + "个数据");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
