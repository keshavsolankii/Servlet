/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class FirstServlet implements Servlet{
    
    ServletConfig conf;
    
    //Life cycle methods
    @Override
    public void init(ServletConfig conf)
    {
        this.conf = conf;
        System.out.println("Creating object...");
    }
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Processing...");
        resp.setContentType("txt/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is output from first servlet</h1>");
        out.println("<h2>Today's date and current time is "+ new Date().toString() + "</h2>");
    }
    @Override
    public void destroy()
    {
        System.out.println("Destroying object...");
    }
    
    // Non life cycle methods
    @Override
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    @Override
    public String getServletInfo()
    {
        return "This servlet is created by Keshav";
    }
}
