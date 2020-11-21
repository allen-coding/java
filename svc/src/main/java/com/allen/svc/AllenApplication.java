package com.allen.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @date 2020/10/23
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.allen.common", "com.allen.svc", "com.allen.domain"})
@ServletComponentScan(basePackages = "com.allen.svc.web.servlet")
public class AllenApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllenApplication.class, args);
    }
}
