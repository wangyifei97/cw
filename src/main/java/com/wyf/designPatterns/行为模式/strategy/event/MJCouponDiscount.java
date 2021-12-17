package com.wyf.designPatterns.行为模式.strategy.event;

import com.wyf.designPatterns.行为模式.strategy.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @className: com.wyf.designPatterns.行为模式.strategy.event-> MJCouponDiscount
 * @author: 王一飞
 * @createDate: 2021-11-29 9:55 下午
 * @description:
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    /**
     * 满减计算
     * 1.判断满足x元后-n元，否则不减
     * 2.最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo,
                                     BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String o = couponInfo.get("n");
        // 小于 商品金额条件的，直接返回商品原价
        if (0 > skuPrice.compareTo(new BigDecimal(x))) {
            return skuPrice;
        }
        // 减去优惠金额判断
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        if (1 > discountAmount.compareTo(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
