package com.cyan.running.step;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: Cyan
 * @date: 2021/5/10
 */
public class Result<T> implements Serializable {

    private String code;
    private String message;
    private T data;

    public static Result<java.util.HashMap<String, Object>> success() {
        Result<java.util.HashMap<String, Object>> result = new Result<>();
        result.setCode("200");
        result.setMessage("成功");
        return result;
    }

    public static Result<Object> success(Object object) {
        Result<Object> result = new Result<>();
        result.setCode("200");
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result<Object> success(String name, Object object) {
        Result<Object> result = new Result<>();
        result.setCode("200");
        result.setMessage("成功");
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(name, object);
        result.data = map;
        return result;
    }

    public static Result fail(String code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }
}
