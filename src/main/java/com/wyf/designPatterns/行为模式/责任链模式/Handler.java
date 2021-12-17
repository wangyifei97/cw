package com.wyf.designPatterns.行为模式.责任链模式;

import lombok.Data;

/**
 * @className: com.wyf.designPatterns.行为模式.责任链模式-> Handler
 * @author: 王一飞
 * @createDate: 2021-12-16 10:30 上午
 * @description: 公共接口
 */
@Data
public abstract class Handler {
    private Handler next;

    // 具体的抽象处理方法
    public abstract String selfHandlerProcess(String name);

    // 链头的具体处理着
    public String doHandle(String name) {
        String tempResult = selfHandlerProcess(name);
        if (null != next) {
            return next.doHandle(tempResult);
        }
        return tempResult;
    }
}
