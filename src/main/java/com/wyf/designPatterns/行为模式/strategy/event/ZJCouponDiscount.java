package com.wyf.designPatterns.行为模式.strategy.event;

import com.wyf.designPatterns.行为模式.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.行为模式.strategy.event-> ZJCouponDiscount
 * @author: 王一飞
 * @createDate: 2021-11-29 9:58 下午
 * @description:
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     *
     * @param couponInfo 劵折扣信息；
     * @param skuPrice   金额
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (1 > discountAmount.compareTo(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
