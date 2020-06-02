package com.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/
 * Servlet Filter implementation class Second
 */
public class Second implements Filter {

    public Second() {
        // TODO Auto-generated constructor stub
    }

    /
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        PrintWriter out = response.getWriter();
        HttpSession ss1 = req.getSession();
        String Er = (String) ss1.getAttribute("Er");
        String header = (String) ss1.getAttribute("header");
        StringBuilder input1 = new StringBuilder();
        input1.append(Er);
        StringBuilder Er1 = input1.reverse();
        if (header != null) {
            out.print("You are using IE");
        } else {
            out.print("Value From Servlet : " + Er);
            out.print("\n");
            out.print("Value From Filter : " + Er1);
        }
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}

