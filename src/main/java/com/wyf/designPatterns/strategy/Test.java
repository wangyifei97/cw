package com.wyf.designPatterns.strategy;

import com.wyf.designPatterns.strategy.event.MJCouponDiscount;
import com.wyf.designPatterns.strategy.event.ZJCouponDiscount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: com.wyf.designPatterns.strategy-> Test
 * @author: 王一飞
 * @createDate: 2021-11-29 10:02 下午
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        // 直减，100-10，商品100
        Context<Double> ZJcontext = new Context<>(new ZJCouponDiscount());
        BigDecimal ZjResult = ZJcontext.discountAmount(10D, new BigDecimal(100));
        System.out.println("直减:  " + ZjResult);

        // 满100减10，商品100
        Context<Map<String, String>> MJMapReqContext = new Context<>(new MJCouponDiscount());
        HashMap<String, String> MJParam = new HashMap<String, String>() {{
            put("x", "100");
            put("n", "10");
        }};
        BigDecimal MjResult = MJMapReqContext.discountAmount(MJParam, new BigDecimal(100));
        System.out.println("满100减10:  " + MjResult);
    }
}
