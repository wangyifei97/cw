package com.wyf.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @author wangyifei
 * @date 2021/5/3122:21
 */
public class Invoker implements InvocationHandler {

    public Object entity;

    public Invoker(Object entity) {
        this.entity = entity;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.entity, args);
    }
}
