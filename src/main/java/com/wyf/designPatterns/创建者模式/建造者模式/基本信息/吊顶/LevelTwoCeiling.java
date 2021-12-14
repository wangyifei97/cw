package com.wyf.designPatterns.创建者模式.建造者模式.基本信息.吊顶;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.Matter;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式.基本信息-> LevelOneCeiling
 * @author: 王一飞
 * @createDate: 2021-12-14 6:44 下午
 * @description: 二级顶
 */
public class LevelTwoCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String mobel() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(900);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，一般离顶120-150mm";
    }
}
