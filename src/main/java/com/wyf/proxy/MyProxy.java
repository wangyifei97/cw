package com.wyf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangyifei
 * @Description
 * @date 2021/5/31 21:02
 */
interface Star {
    //吃饭
    void haveMeal();

    //喝水
    void drinkLotsWater();

    //吃药
    void takeMedicine();
}

class RealStar implements Star {

    @Override
    public void haveMeal() {
        System.err.println("吃饭了");
    }


    @Override
    public void drinkLotsWater() {
        System.err.println("喝水了");
    }

    @Override
    public void takeMedicine() {
        System.err.println("吃药了");
    }
}

class StartHandler implements InvocationHandler {
    Star star;

    public StartHandler(Star star) {
        super();
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        System.out.println("新的一天开始了！");
        if (method.getName().equals("drinkLotsWater")) {
            object = method.invoke(star, args);
            System.out.println("走到了 喝水的方法");
        }
        if (method.getName().equals("takeMedicine")) {
            object = method.invoke(star, args);
            System.out.println("走到了 吃药的方法");
        }
        System.out.println("晚上睡觉了！");
        return object;
    }
}

class MyProxy {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        StartHandler startHandler = new StartHandler(realStar);

        Star proxyInstance = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, startHandler);
        proxyInstance.drinkLotsWater();
    }
}
