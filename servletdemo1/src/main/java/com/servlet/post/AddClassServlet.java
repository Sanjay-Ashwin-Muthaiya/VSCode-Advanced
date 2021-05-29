package com.servlet.post;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddClassServlet extends HttpServlet {
    AddClass obj=new AddClass();
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
         String x=req.getParameter("num_1");
         String y=req.getParameter("num_2");
         PrintWriter out=res.getWriter();
         res.setContentType("text/html");
         if(x.length()<3){
             out.println("<h1> Please enter name above 3 char </h1>");
            // req.getSession().setAttribute("num_1","Character above 3");
             return;
         }
         if(y.length()<1){
           // out.println("<h1>This field cannot be empty</h1>");
            req.getSession().setAttribute("num_1","Field not empty");
          req.getRequestDispatcher("index.jsp").include(req, res);
            return;
         }
    }
    
}
