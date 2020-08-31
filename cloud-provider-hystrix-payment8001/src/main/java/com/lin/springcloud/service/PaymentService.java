package com.lin.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池" + Thread.currentThread().getName() + "paymentinfo_OK,id" + id;
    }

    public String paymentInfo_TimeOut(Integer id) {
        int timenumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timenumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + "paymentinfo_OUT,id" + id;
    }
}
