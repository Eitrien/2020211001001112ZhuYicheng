package com.ZhuYicheng.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet  {

    public  void  doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Date date = new Date();

        PrintWriter writer = response.getWriter();
        writer.println("Name:Zhu Yicheng");
        writer.println("ID:2020211001001112");
        writer.println(date.toString());
    }

    public  void  doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
