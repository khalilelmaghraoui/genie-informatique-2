package com.tp1.appServlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class LoggingFilter implements javax.servlet.Filter {
    private static final String logging = "/login.jsp";
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        HttpServletRequest rq = (HttpServletRequest) req;
        HttpSession session = rq.getSession();

        if (session.getAttribute("user") == null) {

            rq.getRequestDispatcher(logging).forward(req, resp);

        } else {
            chain.doFilter(req, resp);

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public LoggingFilter() {
    }

}
