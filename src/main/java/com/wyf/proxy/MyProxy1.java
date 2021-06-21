//package com.wyf.proxy;
//
//import cn.hutool.extra.spring.SpringUtil;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Proxy;
//
//enum CatEnum {
//    heshui(0, "catService"), chifan(1, "dogService");
//
//    int code;
//    String name;
//
//    CatEnum(int code, String name) {
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//@Component
//interface actionService {
//    void run();
//}
//
//@Component
//class CatServerImpl implements actionService {
//    @Override
//    public void run() {
//        System.out.println("这里是业务代码，如 添加 项目字段");
//    }
//}
//
//@Component
//class DogServerImpl implements actionService {
//    @Override
//    public void run() {
//        System.out.println("这里是业务代码，如 添加 企业附件");
//    }
//}
//
////调用处理类
////class CatInvoke implements InvocationHandler {
////
////    @Override
////    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////        return null;
////    }
////}
//
//public class MyProxy1 {
//    public static CatService getCat(CatEnum catEnum) {
//        //获得对应 实现类
//        Object bean = SpringUtil.getBean(catEnum.getName());
//        //参入参数
//        Invoker invoker = new Invoker(bean);
//        return (CatService) Proxy.newProxyInstance(bean.getClass().getClassLoader(), new Class[]{CatService.class}, invoker);
//    }
//
//    public static void main(String[] args) {
//        getCat(CatEnum.heshui);
//    }
//}
//
