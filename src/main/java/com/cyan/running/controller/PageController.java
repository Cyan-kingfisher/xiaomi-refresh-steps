package com.cyan.running.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Cyan
 * @date: 2021/5/20
 */
@Controller
@CrossOrigin
public class PageController {

    @RequestMapping("/")
    public String see() {
        return "step";
    }

}
