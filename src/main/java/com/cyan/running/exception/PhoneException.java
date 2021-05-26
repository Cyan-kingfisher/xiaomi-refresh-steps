package com.cyan.running.exception;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public class PhoneException extends RuntimeException {
    public PhoneException() {
        super("手机号格式错误");
    }
}
