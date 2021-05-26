package com.cyan.running.controller;


import com.cyan.running.exception.PasswordException;
import com.cyan.running.exception.PhoneException;
import com.cyan.running.exception.StepsException;
import com.cyan.running.service.HuamiShuaBuService;
import com.cyan.running.service.PasswordCheckService;
import com.cyan.running.service.PhoneCheckService;
import com.cyan.running.service.StepsCheckService;

import com.cyan.running.step.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * @author Cyan
 * @date: 2021/5/20
 */
@Slf4j
@RestController
@CrossOrigin
public class StepController {

    @Autowired
    HuamiShuaBuService huamiShuaBuService;

    @Autowired
    PhoneCheckService phoneCheckService;

    @Autowired
    PasswordCheckService passwordCheckService;

    @Autowired
    StepsCheckService stepsCheckService;

    @PostMapping("/mi")
    public Result start(String phoneNumber, String password, Integer steps) throws Exception {

        CompletableFuture<Boolean> bool1 = phoneCheckService.phoneCheck(phoneNumber);
        CompletableFuture<Boolean> bool2 = passwordCheckService.passCheck(password);
        CompletableFuture<Boolean> bool3 = stepsCheckService.stepsCheck(steps);

        if (!bool1.get()) {
            throw new PhoneException();
        } else if(!bool2.get()) {
            throw new PasswordException();
        } else if(!bool3.get()) {
            throw new StepsException();
        } else {
            Object o = huamiShuaBuService.mainHandler(phoneNumber, password, steps).join();
        }
        return Result.success();

    }
}