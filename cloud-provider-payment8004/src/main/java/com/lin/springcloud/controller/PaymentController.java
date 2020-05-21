package com.lin.springcloud.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.prot}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return "spring cloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
