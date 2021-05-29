package com.sanjay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddClass extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException  {
        
        int x=Integer.parseInt(req.getParameter("date_Num"));
        Calendar calen=Calendar.getInstance();
        calen.add(Calendar.DATE,x);
        Date d=calen.getTime();
        PrintWriter out=res.getWriter();
        out.println("<h1>");
        out.println("Your date from "+x+" days is "+d);
        out.println("</h1>");
        req.getRequestDispatcher("view.jsp").include(req, res);;
    }
}
