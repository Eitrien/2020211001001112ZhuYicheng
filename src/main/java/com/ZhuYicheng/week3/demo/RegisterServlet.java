package com.ZhuYicheng.week3.demo;

import com.ZhuYicheng.week4.demo.databaseSetting;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(asyncSupported = true, value = "/register")
public class RegisterServlet extends HttpServlet {

    Connection conn;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        conn = databaseSetting.getConnection();

        String username = request.getParameter("user");
        String psw = request.getParameter("psw");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birth = request.getParameter("birth");

        String sql = "insert into register(username,password,email,gender,birthdate) values(?,?,?,?,?)";

        try {
            PreparedStatement preps = conn.prepareStatement(sql);
            preps.setString(1,username);
            preps.setString(2,psw);
            preps.setString(3,email);
            preps.setString(4,gender);
            preps.setString(5,birth);
            if(!preps.execute()){
                databaseSetting.release(conn,preps);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        PrintWriter writer = response.getWriter();
        writer.println("<br> username:"+username);
        writer.println("<br> psw:"+psw);
        writer.println("<br> email"+email);
        writer.println("<br> gender:"+gender);
        writer.println("<br> birth:"+birth);
        writer.close();
    }
}
