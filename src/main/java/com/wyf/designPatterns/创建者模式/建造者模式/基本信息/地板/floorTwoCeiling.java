package com.wyf.designPatterns.创建者模式.建造者模式.基本信息.地板;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.Matter;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式.基本信息-> LevelOneCeiling
 * @author: 王一飞
 * @createDate: 2021-12-14 6:44 下午
 * @description: 圣象地板
 */
public class floorTwoCeiling implements Matter {

    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象地板";
    }

    @Override
    public String mobel() {
        return "B+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(200);
    }

    @Override
    public String desc() {
        return "圣象地板是全球专业木板制作商，北京专用地板";
    }
}
