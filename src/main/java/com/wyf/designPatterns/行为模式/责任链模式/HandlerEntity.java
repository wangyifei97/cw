package com.wyf.designPatterns.行为模式.责任链模式;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.行为模式.责任链模式-> HandlerEntity
 * @author: 王一飞
 * @createDate: 2021-12-16 10:43 上午
 * @description: 数据传输实体类
 */
@Data
public class HandlerEntity {
    private String name;
    private BigDecimal price;
    private Integer level;
}
