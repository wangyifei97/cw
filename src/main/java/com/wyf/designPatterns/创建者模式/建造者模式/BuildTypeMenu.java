package com.wyf.designPatterns.创建者模式.建造者模式;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @className: com.wyf.designPatterns.创建者模式.建造者模式-> BuildTypeMenu
 * @author: 王一飞
 * @createDate: 2021-12-07 10:47 上午
 * @description: 建造类型枚举
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum BuildTypeMenu {
    豪华欧式("豪华欧式"),
    轻奢庄园("轻奢庄园"),
    现代简约("现代简约");
    private String name;
}
