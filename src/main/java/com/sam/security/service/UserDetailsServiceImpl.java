package com.sam.security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Mr.xuewenming
 * @title: UserDetailsServiceImpl
 * @projectName spring-boot-security-demo
 * @description: UserDetailsService
 * @date 2019/11/2116:34
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 暂时使用静态数据
        UserDetails build = User.withUsername("xiaohong").password("$2a$10$SgAAsHpBGKWHIH9yG1RZLuGVCTO/PRilCK4VMKpn/Dn2p9GTEPwdW").authorities("r1").build();
        return build;
    }

}
