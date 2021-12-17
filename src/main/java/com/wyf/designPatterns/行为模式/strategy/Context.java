package com.wyf.designPatterns.行为模式.strategy;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.行为模式.strategy-> Context
 * @author: 王一飞
 * @createDate: 2021-11-29 10:01 下午
 * @description:
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
