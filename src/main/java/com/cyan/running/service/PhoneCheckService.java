package com.cyan.running.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public interface PhoneCheckService {
    /**
     * 检查手机号合法性
     *
     * @param phone
     * @return
     */
    CompletableFuture<Boolean> phoneCheck(String phone) ;
}
