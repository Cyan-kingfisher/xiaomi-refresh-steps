package com.cyan.running.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
@Service
@Slf4j
public class PhoneCheckServiceImpl implements PhoneCheckService {
    @Override
    @Async
    public CompletableFuture<Boolean> phoneCheck(String phone){
        if(phone==null||phone.length()!=11) {
            log.info("PhoneCheck-error: length error");
            return CompletableFuture.completedFuture(false);
        }

        for(int i=0;i<phone.length();i++){
            char ch = phone.charAt(i);
            if (i==0&&ch!='1') {
                log.info("PhoneCheck-error: "+phone);
                return CompletableFuture.completedFuture(false);
            }
            if(!Character.isDigit(ch)) {
                log.info("PhoneCheck-error: "+phone);
                return CompletableFuture.completedFuture(false);
            }
        }
        log.info("PhoneCheck-success: "+phone);
        return CompletableFuture.completedFuture(true);
    }
}
