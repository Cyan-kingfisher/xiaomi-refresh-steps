package com.cyan.running.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Cyan
 * @date: 2021/5/20
 */
public interface PasswordCheckService {

    /**
     * 检查密码格式合法性
     *
     * @param password
     * @return
     */
    CompletableFuture<Boolean> passCheck(String password);

}
