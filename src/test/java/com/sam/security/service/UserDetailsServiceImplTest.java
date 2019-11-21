package com.sam.security.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Mr.xuewenming
 * @title: UserDetailsServiceImplTest
 * @projectName spring-boot-security-demo
 * @description: TODO
 * @date 2019/11/2116:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDetailsServiceImplTest {

    @Test
    public void testBcy() {
        String hashpw = BCrypt.hashpw("123", BCrypt.gensalt());
        System.out.println(hashpw);
    }
}