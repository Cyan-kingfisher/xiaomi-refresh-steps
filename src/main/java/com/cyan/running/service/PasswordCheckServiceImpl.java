package com.cyan.running.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Cyan
 * @date: 2021/5/20
 */
@Slf4j
@Service
public class PasswordCheckServiceImpl implements PasswordCheckService {

    @Override
    @Async
    public CompletableFuture<Boolean> passCheck(String password)  {
        if (password==null||password.length()==0){
            log.info("PassCheck-error: length error");
            return CompletableFuture.completedFuture(false);
        }
        log.info("PassCheck-success: "+password);
        return CompletableFuture.completedFuture(true);
    }


}
