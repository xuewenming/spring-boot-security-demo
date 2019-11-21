package com.sam.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Mr.xuewenming
 * @title: WebSecurityConfig
 * @projectName spring-boot-security-demo
 * @description: Security配置类
 * @date 2019/11/2115:42
 */
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 对web请求进行保护
        http.csrf().disable().authorizeRequests()
                // web授权
                //.antMatchers("/login/r/r1").hasAuthority("r1")
                //.antMatchers("/login/r/r2").hasAuthority("r2")
                .antMatchers("/login/r/r1").authenticated()
                .antMatchers("/login/r/r2").authenticated()
                .antMatchers("/login/r/**").authenticated()
                // 所有请求都放行
                .antMatchers(HttpMethod.OPTIONS).permitAll()
                // 除了上面的web路径，其余都放行
                .anyRequest().permitAll()
                .and()
                // 允许表单登录
                .formLogin()
                // 登录URL
                .successForwardUrl("/login")
                .and()
                // 退出
                .logout()
                // 退出URL
                .logoutUrl("/logout");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
