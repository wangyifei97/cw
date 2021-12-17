package com.wyf.designPatterns.行为模式.strategy;

/**
 * @className: com.wyf.designPatterns.行为模式.strategy-> 反面案例
 * @author: 王一飞
 * @createDate: 2021-11-29 9:45 下午
 * @description: 反面案例
 */
public class 反面案例 {
    /**
     * @createAuthor: 王一飞
     * @createDate: 2021/11/29 9:46 下午
     * @param: type : 优惠劵类型
     * @param: typeContent : 优惠劵金额
     * @param: skuPrice : 商品金额
     * @param: typeExt : 扩展字段
     */
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt) {
        // 1.直减劵
        if (1 == type) {
            return skuPrice - typeContent;
        }
        // 2.满减劵
        if (2 == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return skuPrice - typeContent;
        }
        // 3. 折扣劵
        if (3 == type) {
            return skuPrice * typeContent;
        }
        // 4. n元购
        if (4 == type) {
            return typeContent;
        }
        return 0D;
    }
}
