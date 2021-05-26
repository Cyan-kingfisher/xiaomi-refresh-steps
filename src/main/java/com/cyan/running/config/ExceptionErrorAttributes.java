package com.cyan.running.config;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
import java.util.Set;

/**
 * 异常处理嵌入springboot
 *
 * @author: Cyan
 * @date: 2021/5/19
 */
@Component
public class ExceptionErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, options);
        Map<String, Object> exMap = (Map<String, Object>) webRequest.getAttribute("exMap", 0);
        Set<String> set = exMap.keySet();
        for (String str:set) {
            map.put(str, exMap.get(str));
        }
        map.remove("trace");
        return map;
    }
}
