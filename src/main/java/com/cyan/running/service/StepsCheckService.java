package com.cyan.running.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public interface StepsCheckService {

    /**
     * 检查步数合法性
     *
     * @param step
     * @return
     */
    CompletableFuture<Boolean> stepsCheck(Integer step);
}
