package com.wyf.designPatterns.行为模式.责任链模式;

/**
 * @className: com.wyf.designPatterns.行为模式.责任链模式-> HandlerOneService
 * @author: 王一飞
 * @createDate: 2021-12-16 11:03 上午
 * @description: 责任链实现类3
 */
public class HandlerThreeService extends Handler {
    @Override
    public String selfHandlerProcess(String name) {
        if ("乌索普".equals(name)) {
            return null;
        }
        return name + "     " + "蒙卡上校驻地索隆出海了";
    }
}
