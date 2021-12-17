package com.wyf.designPatterns.行为模式.责任链模式;

/**
 * @className: com.wyf.designPatterns.行为模式.责任链模式-> HandlerOneService
 * @author: 王一飞
 * @createDate: 2021-12-16 11:03 上午
 * @description: 责任链实现类2
 */
public class HandlerTwoService extends Handler {
    @Override
    public String selfHandlerProcess(String name) {
        if ("乌索普".equals(name)) {
            return null;
        }
        return name + "     " + "海上餐厅香吉士出海了";
    }
}
