package com.cyan.running.exception;

/**
 * @author: Cyan
 * @date: 2021/5/21
 */
public class AccountException extends RuntimeException {
    public AccountException() {
        super("用户名或密码错误");
    }
}
