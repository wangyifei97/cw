package com.wyf.designPatterns.创建者模式.建造者模式.基本信息;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式-> Matter
 * @author: 王一飞
 * @createDate: 2021-12-07 10:55 上午
 * @description: 物料接口（基本信息，所有的装修材料可以按照统一标准获取）
 */
public interface Matter {
    // 场景：地板、地砖、涂料、吊顶。
    String scene();

    // 品牌
    String brand();

    // 型号
    String mobel();

    // 价格
    BigDecimal price();

    // 描述
    String desc();
}
