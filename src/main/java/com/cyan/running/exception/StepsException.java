package com.cyan.running.exception;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public class StepsException extends RuntimeException {
    public StepsException() {
        super("步数输入异常");
    }
}
