package com.sam.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.xuewenming
 * @title: LoginController
 * @projectName spring-boot-security-demo
 * @description: TODO
 * @date 2019/11/2115:34
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/home")
    public String login() {
        return "首页门户";
    }

    @GetMapping("/r/r1")
    public String loginR1() {
        return "r1";
    }

    @GetMapping("/r/r2")
    public String longR2() {
        return "r2";
    }


}
