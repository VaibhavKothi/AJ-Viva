package com.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class First extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        HttpSession ss = request.getSession();
        String userAgent = request.getHeader("User-Agent");

        ss.setAttribute("heder", userAgent);

        if (userAgent.contains("Trident")) {
            System.out.println("Use IE");
            ss.setAttribute("header", "Your browser is Microsoft Internet Explorer");
        }else {
            System.out.println("Here");
            ss.setAttribute("Er", "Welcome 170010116016 Student");
        }
        ss.setAttribute("Er", "170010116016");
        response.sendRedirect("Second.jsp");
    }

}
