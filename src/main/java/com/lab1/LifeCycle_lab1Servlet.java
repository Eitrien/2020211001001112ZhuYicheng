package com.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LifeCycle_lab1Servlet", value = "/lifecycle")
public class LifeCycle_lab1Servlet extends HttpServlet {

    private int i = 0;

    @Override
    public void init() throws ServletException{
        super.init();
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        i++;

        PrintWriter writer = response.getWriter();

        writer.println("<html><body>");
        writer.println("<h1>"+"Since loading,this servlet has been accessed"+i+"times"+"</h1>");
        writer.println("</br>");
        writer.println("<h1>name:ZhuYiCheng</h1>");
        writer.println("</br>");
        writer.println("<h1>ID:2020211001001112</h1>");
        writer.println("</br>");
        writer.println("<body><html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy(){
        super.destroy();
        System.out.println("destroy");
    }
}
