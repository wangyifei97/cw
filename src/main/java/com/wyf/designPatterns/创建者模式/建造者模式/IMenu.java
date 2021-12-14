package com.wyf.designPatterns.创建者模式.建造者模式;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.Matter;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式-> IMenu
 * @author: 王一飞
 * @createDate: 2021-12-07 10:34 上午
 * @description: 包装接口
 */
public interface IMenu {
    // 吊顶
    IMenu appendCeiling(Matter matter);

    // 涂料
    IMenu appendCoat(Matter matter);

    // Matter
    IMenu appendFloor(Matter matter);

    // 地砖
    IMenu appendTile(Matter matter);

    // 明细
    String getDetail();
}
