package com.cw.nacos.nacosConsumer;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoNacosConsumerApplication.class, args);
    }

}
