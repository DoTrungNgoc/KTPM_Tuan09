package com.example.retry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

import javax.management.ServiceNotFoundException;

@SpringBootTest
class RetryApplicationTests {
    @Autowired
    RetryService retryService;

    @Test
    void contextLoads(){
        try {
            retryService.retry();
        } catch (Exception e){
        }
    }
}
