package com.wyf.designPatterns.strategy;

import java.math.BigDecimal;

/**
 * @className: com.wyf.designPatterns.strategy-> ICouponDiscount
 * @author: 王一飞
 * @createDate: 2021-11-29 9:52 下午
 * @description: 接口：优惠劵金额计算
 */
public interface ICouponDiscount<T> {
    /**
     * 优惠劵金额计算
     *
     * @param couponInfo 劵折扣信息；
     * @param skuPrice   金额
     * @return 优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
