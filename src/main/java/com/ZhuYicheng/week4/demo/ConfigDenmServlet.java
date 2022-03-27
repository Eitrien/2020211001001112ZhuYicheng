package com.ZhuYicheng.week4.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ConfigDenmServlet", value = "/ConfigDenmServlet")
public class ConfigDenmServlet extends HttpServlet {

    String Id = "e";
    String Name = "e";
    String Class = "e";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = databaseSetting.getConnection();
        String sql = "select * from stuinfo";

        List list = new ArrayList();

        try{
            PreparedStatement preps = conn.prepareStatement(sql);
            ResultSet rs = preps.executeQuery();
            while (rs.next()) {
                List obj = new ArrayList();
                obj.add(rs.getString(1));
                obj.add(rs.getString(2));
                obj.add(rs.getString(3));
                list.add(obj);
            }
            Id = ((List) list.get(0)).get(0).toString();
            Name = ((List) list.get(0)).get(1).toString();
            Class = ((List) list.get(0)).get(2).toString();


        } catch (SQLException e){
            e.printStackTrace();
        }

        PrintWriter writer = response.getWriter();
        writer.println("<br> StuId:"+Id);
        writer.println("<br> Name:"+Name);
        writer.println("<br> Class:"+Class);
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
