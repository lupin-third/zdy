package com.springboot.zdy.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 14:47
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token){
        this.token = token;
    }
    @Override
    public Object getPrincipal(){
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
