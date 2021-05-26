package com.cyan.running.exception;

/**
 * @author Cyan
 * @date: 2021/5/20
 */
public class ApiErrorException extends RuntimeException{
    public ApiErrorException() {
        super("Api调用异常，请稍后尝试");
    }
}
