package com.cyan.running;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author: Cyan
 * @date: 2021/5/20
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RunningApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunningApplication.class, args);
    }

}
