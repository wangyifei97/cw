package com.wyf.designPatterns.行为模式.strategy.event;

import com.wyf.designPatterns.行为模式.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.行为模式.strategy.event-> ZKCouponDiscount
 * @author: 王一飞
 * @createDate: 2021-11-29 10:00 下午
 * @description:
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(
                new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        if (1 > discountAmount.compareTo(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
