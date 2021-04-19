package com.springboot.zdy.config.shiro;


import cn.hutool.http.server.HttpServerRequest;
import cn.hutool.http.server.HttpServerResponse;
import cn.hutool.json.JSONUtil;
import com.springboot.zdy.entity.result.Result;
import com.springboot.zdy.config.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 13:53
 */
@Component
public class JwtFilter extends AuthenticatingFilter {
    @Autowired
    JwtUtils jwtUtils;

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        //获取token
        HttpServerRequest request = (HttpServerRequest) servletRequest;
        String jwt = request.getHeader("Authorization");
        if (StringUtils.isEmpty(jwt)) {
            return null;
        }
        return new JwtToken(jwt);
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String token = request.getHeader("Authorization");
        if (StringUtils.isEmpty(token)) {
            return true;
        } else {
            //判断是否已经过期
            Claims claim = jwtUtils.getClaimByToken(token);
            if (claim == null || jwtUtils.isTokenExpired(claim.getExpiration())) {
                throw new ExpiredCredentialsException("token已失效，请重新登录!");
            }
        }
        //执行自动登录
        return executeLogin(servletRequest, servletResponse);
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        HttpServerResponse httpResponse = (HttpServerResponse) response;
        try {
            //处理登录失败的异常
            Throwable throwable = e.getCause() == null ? e : e.getCause();
            Result r = Result.fail(throwable.getMessage());
            String json = JSONUtil.toJsonStr(r);
            httpResponse.getWriter().println(json);
        } catch (Exception e1) {

        }
        return false;
    }
    /**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception{
        HttpServletRequest httpServletRequest =  WebUtils.toHttp(request);
        HttpServletResponse httpServletResponse = WebUtils.toHttp(response);
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        //跨域时会首先发送一个OPTIONS请求，这里我们给OPTIONS请求直接返回正常状态
        if(httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())){
            httpServletResponse.setStatus(org.springframework.http.HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }






}
