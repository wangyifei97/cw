package com.cw.nacos.nacosConsumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @author Annlla
 * @date 2021/6/24 8:53
 */
@Controller
@RequestMapping("config")
public class NacosConfigController {
//    @NacosValue(value = "${useLocalCache}", autoRefreshed = true)
//    @Value("${useLocalCache}")
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }
}
