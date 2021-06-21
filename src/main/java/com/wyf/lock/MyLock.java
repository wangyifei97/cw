package com.wyf.lock;

/**
 * @Description
 * @author wangyifei
 * @date 2021/5/31 14:34
 */
public class MyLock {
    static Long start = System.currentTimeMillis();
    long nowTime;

    public long getNowTime() {
        return nowTime;
    }

    public void setNowTime(long nowTime) {
        this.nowTime = nowTime;
    }

    public void soutCurrentTimeMillis(){
        MyLock myLock = new MyLock();

        for (;;){

            Runnable runnable = () -> {
                try {
                    Thread.sleep(700);
                    long l = System.currentTimeMillis() - start;

                    myLock.setNowTime(l);

                    System.err.println(l);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            };
            runnable.run();

            if (myLock.getNowTime() >10000){
                return;
            }
        }
    }


    public static void main(String[] args) {
        Integer a = 2;
        System.err.println(0 << 1);
        System.err.println(a >> 30);
    }
}
