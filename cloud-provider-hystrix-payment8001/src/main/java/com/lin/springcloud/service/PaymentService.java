package com.lin.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "paymentinfo_OK,id" + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler" , commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        int timenumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timenumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + "paymentinfo_OUT,id" + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "paymentInfo_TimeOutHandler,id" + id + '\t' + "o(╥﹏╥)o";
    }

    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String serialNumble = IdUtil.simpleUUID();
        UUID.randomUUID().toString();
        return Thread.currentThread().getName()+"\t"+"调用成功，流水号"+serialNumble;
    }

}
