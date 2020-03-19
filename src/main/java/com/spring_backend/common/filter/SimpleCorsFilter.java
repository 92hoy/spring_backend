package com.spring_backend.common.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component @Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCorsFilter extends GenericFilterBean {
    @Value("${spring.cors.headers:Authorization, Cache-Control, Content-Type, DNT, If-Modified-Since, Keep-Alive, " +
        "User-Agent, X-Requested-With, X-Proxy-User, X-Session-Token, X-Realm, X-Real-IP, X-Forwarded-For}")
    private String corsHeaders = null;

    @Override public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpRes = (HttpServletResponse) response;
        httpRes.setHeader("Access-Control-Allow-Origin", request.getRemoteHost() + ":" + request.getRemotePort());
        httpRes.setHeader("Access-Control-Allow-Methods", "DELETE, GET, HEAD, OPTIONS, POST, PUT");
        httpRes.setHeader("Access-Control-Allow-Headers", "ServiceCookies,Api-Key,Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
        httpRes.setHeader("Access-Control-Expose-Headers", "Authorization");
        //httpRes.setHeader("Access-Control-Allow-Headers", "X-Requested-With");
        httpRes.setHeader("Access-Control-Allow-Credentials", "true");
        httpRes.setHeader("Access-Control-Allow-Origin", "*");
        httpRes.setHeader("Access-Control-Max-Age", "3600");
        chain.doFilter(request, response);
    }
}
