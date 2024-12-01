package com.etender.etender_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@EnableAsync
public class scheduler {
    private final Trainer trainer;

    public scheduler(Trainer trainer) {
        this.trainer = trainer;
    }

    @Scheduled(initialDelay = 10,fixedDelay = 100000)
    public void research() throws InterruptedException {
        for(int i = 0; i <= 10; i++){
            trainer.modelTrain(i);
        }
    }

}
