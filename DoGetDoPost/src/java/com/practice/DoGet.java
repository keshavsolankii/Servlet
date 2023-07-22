/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;


/**
 *
 * @author HP
 */
public class DoGet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        System.out.println("This is get method...");
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        out.print("<h2> This is servlet which takes GET requests</h2>");
        
    }
}
