package com.wyf.designPatterns.创建者模式.建造者模式;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.吊顶.LevelOneCeiling;
import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.吊顶.LevelTwoCeiling;
import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.地板.floorOneCeiling;
import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.地板.floorTwoCeiling;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式-> Builder
 * @author: 王一飞
 * @createDate: 2021-12-07 10:33 上午
 * @description: 建造者类具体各种组装由此类实现
 */
public class Builder {
    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.println(builder.levelOne(BigDecimal.valueOf(300)).getDetail());
    }

    // 现代简约
    public IMenu levelOne(BigDecimal area) {
        return new DecorationPackageMenu(area, BuildTypeMenu.现代简约)
                .appendCeiling(new LevelTwoCeiling())
                .appendFloor(new floorTwoCeiling());
    }

    public IMenu haowa(BigDecimal area) {
        return new DecorationPackageMenu(area, BuildTypeMenu.豪华欧式)
                .appendCeiling(new LevelOneCeiling())
                .appendFloor(new floorOneCeiling());
    }
}
