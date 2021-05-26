package com.cyan.running.exception;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public class PasswordException extends RuntimeException {
    public PasswordException() {
        super("密码格式错误");
    }
}
