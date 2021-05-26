package com.cyan.running.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 统一异常处理
 *
 * @author: Cyan
 * @date: 2021/5/20
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
    public String exceptionHandler(Exception e, HttpServletRequest request) throws Exception {

        Map<String, Object> map = new LinkedHashMap<>();

        String exceptionName = e.getClass().getSimpleName();
        log.info("excptionName:" + exceptionName);

        switch (exceptionName) {
            case "CompletionException":
                request.setAttribute("javax.servlet.error.status_code", 191);
                map.put("message", "用户名或密码错误");
                map.put("error", e.getMessage());
                break;
            case "MethodArgumentTypeMismatchException":
                request.setAttribute("javax.servlet.error.status_code", 421);
                map.put("message", "步数应该是数字");
                map.put("error", e.getMessage());
                break;
            case "CurrentException":
                request.setAttribute("javax.servlet.error.status_code", 401);
                map.put("message", e.getMessage());
                map.put("error", e.getMessage());
                break;
            case "PasswordException":
                request.setAttribute("javax.servlet.error.status_code", 123);
                map.put("message", e.getMessage());
                map.put("error", e.getMessage());
                break;
            case "PhoneException":
                request.setAttribute("javax.servlet.error.status_code", 151);
                map.put("message", e.getMessage());
                map.put("error", e.getMessage());
                break;
            case "StepsException":
                request.setAttribute("javax.servlet.error.status_code", 171);
                map.put("message", e.getMessage());
                map.put("error", e.getMessage());
                break;
            case "ApiErrorException":
                request.setAttribute("javax.servlet.error.status_code", 101);
                map.put("message", e.getMessage());
                map.put("error", e.getMessage());
                break;
            default:
                request.setAttribute("javax.servlet.error.status_code", 400);
                map.put("message", "未知错误");
                map.put("error", e.getMessage());
        }



        request.setAttribute("exMap", map);
        return "forward:/error";

    }
}