package com.wyf.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author 王一飞
 * @date 2021年06月07日 23:03
 * @description:
 */
public class MyFunction {

    public static Object functionSend(String reobj) throws Exception {
        MyFunction myFunction = new MyFunction();
        Map<String, Object> stringObjectMap = myFunction.validateProcess(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s+"123";
            }
        });
        return stringObjectMap.get("a");
    }

    public Map<String, Object> validateProcess(Function<String, String> function) throws Exception {
        String apply = function.apply("456");
        //noinspection AlibabaCollectionInitShouldAssignCapacity
        return new HashMap<String,Object>(){{
           put("a",apply);
        }};
    }

    public static void main(String[] args) {
        Object o = null;
        try {
            o = MyFunction.functionSend("123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println(o);
    }
}
