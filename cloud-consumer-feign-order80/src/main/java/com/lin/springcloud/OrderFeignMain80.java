package com.lin.springcloud;

import cn.hutool.socket.protocol.Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.util.Map;
import java.util.Set;

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderFeignMain80.class, args);
        ProtocolResolver protocolResolver = new ProtocolResolver() {
            @Override
            public Resource resolve(String s, ResourceLoader resourceLoader) {
                s = "abc";
                return resourceLoader.getResource(s);
            }
        };
        run.addProtocolResolver(protocolResolver);
        ConfigurableEnvironment environment = run.getEnvironment();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        Set<Map.Entry<String, Object>> entries = systemEnvironment.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            Object value = entry.getValue();
            System.out.println(value);
        }

    }
}

