package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRegistration extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String fname = req.getParameter("fname");
         String lname = req.getParameter("lname");
        String dob = String.valueOf(req.getParameter("dob"));
        // dob=date_dob(dob);
        String qualification = req.getParameter("qualification");
        String mobile_num = String.valueOf((req.getParameter("mobile")));
        String appoint_date = req.getParameter("appoint_date"); 
        // appoint_date=date_appointment(appoint_date);
        /* PrintWriter out = res.getWriter();
        if (fname.length() < 3) {
            out.println("<b><font color='red'>Please enter valid name. Try Again!</font></b>");
            req.getRequestDispatcher("index.html").include(req, res);
        } else {
            out.println("<b><font color='green'>Hello " + fname + " Your Registration Success!</font></b>"); */
            /*
             * ServletRegistration obj=new
             * ServletRegistration(fname,lname,dob,qualification,mobile_num,appoint_date);
             * save(obj); viewData();
             */
             res.setContentType("text/html");
             PrintWriter out=res.getWriter();
             req.setAttribute("fname",fname);
             req.setAttribute("lname", lname);
             req.setAttribute("dob", dob);
             req.setAttribute("qualification",qualification);
             req.setAttribute("mobile",mobile_num);
             req.setAttribute("appoint_date", appoint_date);
       req.getRequestDispatcher("/view.jsp").forward(req, res);
        }
    }

    /*
     * public String date_dob(String dob){ SimpleDateFormat sdf=new
     * SimpleDateFormat("dd/MM/yyyy"); return sdf.format(dob); } public String
     * date_appointment(String appoint_date){ SimpleDateFormat sdf=new
     * SimpleDateFormat("dd/MM/yyyy"); return sdf.format(appoint_date); }
     */
    /*
     * ArrayList<ServletRegistration> al=new ArrayList<ServletRegistration>();
     * public void save(ServletRegistration obj){
     * 
     * al.add(obj); } public void viewData(){ for(ServletRegistration i:al){
     * System.out.println(i); } }
     */
