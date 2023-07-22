/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import javax.servlet.*;
import java.io.*;

/**
 *
 * @author HP
 */
public class SecondServlet extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException, ServletException
    {
        System.out.println("This is Generic servlet!");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is my first generic servlet!</h1>");
        
    }
}
