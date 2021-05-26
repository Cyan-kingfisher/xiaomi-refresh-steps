package com.cyan.running.exception;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public class CurrentException extends RuntimeException {
    public CurrentException() {
        super("请不要频繁点击");
    }
}
