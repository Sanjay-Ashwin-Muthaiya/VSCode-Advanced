package com.sanjay;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddClass2 extends HttpServlet{
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
        res.sendRedirect("https://www.chatsupport.co");
    }
    
}
