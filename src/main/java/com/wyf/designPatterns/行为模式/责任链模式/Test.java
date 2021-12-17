package com.wyf.designPatterns.行为模式.责任链模式;

/**
 * @className: com.wyf.designPatterns.行为模式.责任链模式-> Test
 * @author: 王一飞
 * @createDate: 2021-12-16 11:15 上午
 * @description: 测试
 */
public class Test {
    public static void main(String[] args) {
        HandlerOneService handlerOneService = new HandlerOneService();
        HandlerTwoService handlerTwoService = new HandlerTwoService();
        handlerOneService.setNext(handlerTwoService);
        handlerTwoService.setNext(new HandlerThreeService());

        String 大航海时代开启了 = handlerOneService.doHandle("大航海时代开启了");
        System.out.println(大航海时代开启了);
    }
}
