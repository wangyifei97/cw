package com.cw.nacos.nacosConsumer;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nacos-config-consumer", autoRefreshed = true)
public class DemoNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoNacosConsumerApplication.class, args);
    }

}
