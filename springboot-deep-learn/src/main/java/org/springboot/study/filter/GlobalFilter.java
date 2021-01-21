package org.springboot.study.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(100)
@Slf4j
public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter初始化");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        log.info("GlobalFilter过滤器开始工作");
        HttpServletResponse response = (HttpServletResponse)res;
        response.addHeader("Header-Global","made in GlobalFilter");
        chain.doFilter(req,res);
        log.info("GlobalFilter过滤器又来了");
    }

    @Override
    public void destroy() {
        log.info("过滤器挂了");
    }

    public static void main(String[] args) {
        Class<?>[] interfaces = GlobalFilter.class.getInterfaces();
    }
}
