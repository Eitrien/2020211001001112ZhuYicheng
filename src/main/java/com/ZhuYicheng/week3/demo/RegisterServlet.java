package com.ZhuYicheng.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("user");
        String psw = request.getParameter("psw");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birth = request.getParameter("birth");

        PrintWriter writer = response.getWriter();
        writer.println("<br> username:"+username);
        writer.println("<br> psw:"+psw);
        writer.println("<br> email"+email);
        writer.println("<br> gender:"+gender);
        writer.println("<br> birth:"+birth);
        writer.close();
    }
}
