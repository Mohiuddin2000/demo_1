package com.etender.etender_demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Trainer {
    @Async
    public void modelTrain(int inx) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("i = "+inx +" "+Thread.currentThread().getName());
    }
}
