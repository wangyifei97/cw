package com.wyf.designPatterns.创建者模式.建造者模式;

import com.wyf.designPatterns.创建者模式.建造者模式.基本信息.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式-> DecorationPackageMenu
 * @author: 王一飞
 * @createDate: 2021-12-07 10:38 上午
 * @description: 实现
 */
public class DecorationPackageMenu implements IMenu {
    // 装修清单
    private List<Matter> list = new ArrayList<>();
    // 装修价格
    private BigDecimal price = BigDecimal.ZERO;
    // 面积
    private BigDecimal area;
    // 装修等级
    private BuildTypeMenu grade;

    public DecorationPackageMenu() {
    }

    public DecorationPackageMenu(BigDecimal area, final BuildTypeMenu grade) {
        this.area = area;
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new
                BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" + "装修清单" + "\r\n" +
                "套餐等级" + grade + "\r\n" +
                "套餐价格" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + "元\r\n" + "房屋面积：" + area.doubleValue() + "平米\r\n" + "材料清单\r\n");

        for (Matter matter : list) {
            detail.append(matter.scene())
                    .append(": ")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.mobel())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append(" 元。\n");
        }
        return detail.toString();
    }
}
