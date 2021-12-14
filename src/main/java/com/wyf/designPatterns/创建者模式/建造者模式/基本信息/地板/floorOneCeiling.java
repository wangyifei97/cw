package com.wyf.designPatterns.创建者模式.建造者模式.基本信息.地板;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.Matter;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式.基本信息-> LevelOneCeiling
 * @author: 王一飞
 * @createDate: 2021-12-14 6:44 下午
 * @description: 德尔地板
 */
public class floorOneCeiling implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔地板";
    }

    @Override
    public String mobel() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "Der德尔集团是全球专业木板制作商，北京专用地板";
    }
}
