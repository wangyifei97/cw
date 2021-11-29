package com.wyf.designPatterns.strategy;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.strategy-> Context
 * @author: 王一飞
 * @createDate: 2021-11-29 10:01 下午
 * @description:
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
