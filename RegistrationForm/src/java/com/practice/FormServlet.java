/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.*;
/**
 *
 * @author HP
 */
public class FormServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
    {
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        out.print("<h2> Welcome to Form Servlet </h2>");
        
        String name = req.getParameter("name");
        String password = req.getParameter("pass");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String checkbox = req.getParameter("condtions");
        String course = req.getParameter("course");
        
        if(checkbox != null)
        {
            out.println("<h2>Name : " + name + "</h2>");
            out.println("<h2>Password : " + password + "</h2>");
            out.println("<h2>Email : " + email + "</h2>");
            out.println("<h2>Gender : " + gender + "</h2>");
            out.println("<h2>Course : " + course + "</h2>");
            
        }
        else
        {
            out.println("<h2>Please check the box!</h2>");
        }
    }
}
