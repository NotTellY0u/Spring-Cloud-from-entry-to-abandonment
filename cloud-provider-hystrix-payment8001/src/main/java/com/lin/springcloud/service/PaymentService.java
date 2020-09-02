package com.lin.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

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
        int timenumber = 3;
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

}
