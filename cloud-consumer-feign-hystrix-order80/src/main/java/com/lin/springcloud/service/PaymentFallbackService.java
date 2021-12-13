package com.lin.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_OK(Integer id) {
        return "---------------PaymentFallbackService fall back----paymentInfo_OK, 呜呜呜";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------------PaymentFallbackService fall back,----paymentInfo_TimeOut 呜呜呜";
    }

}
