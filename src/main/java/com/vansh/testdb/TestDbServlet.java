package com.vansh.testdb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        String user="springstudent";
        String pass="springstudent";
        String jdbcUrl="jdbc:mysql://localhost:3306/web_customer_tracker";
        String driver="com.mysql.jdbc.Driver";
        try{
            PrintWriter out=response.getWriter();
            out.println("Connecting to database: "+jdbcUrl);
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(jdbcUrl,user,pass);
            out.println("Success");
            conn.close();



        }
        catch (Exception exc){
            exc.printStackTrace();
            throw new ServletException(exc);

        }
    }

}
