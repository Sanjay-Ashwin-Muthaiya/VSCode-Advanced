package com.registration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class ServletRegistrationTest {
    @Test
    public void fnameValidate_Test() throws ServletException, IOException{
      HttpServletRequest request = mock(HttpServletRequest.class);       
      HttpServletResponse response = mock(HttpServletResponse.class);    

      when(request.getParameter("fname")).thenReturn("sanjay");
      when(request.getParameter("lname")).thenReturn("muthaiya");
     /*  when(request.getParameter("dob")).thenReturn("muthaiya");
      when(request.getParameter("qualification")).thenReturn("muthaiya");
      when(request.getParameter("mobile_num")).thenReturn("523432473");
      when(request.getParameter("appoint_date")).thenReturn("24-05-21"); */

      StringWriter stringWriter = new StringWriter();
      PrintWriter writer = new PrintWriter(stringWriter);
      when(response.getWriter()).thenReturn(writer);

      new ServletRegistration().doPost(request, response);

      verify(request, atLeast(1)).getParameter("fname"); // only if you want to verify username was called...
      writer.flush(); // it may not have been flushed yet...
      String fname_length=stringWriter.toString();
      assertTrue(fname_length.length()>3);
    } 

    @Test
    public void lnameValidate_Test() throws IOException, ServletException{
      HttpServletRequest request = mock(HttpServletRequest.class);       
      HttpServletResponse response = mock(HttpServletResponse.class);    
      when(request.getParameter("fname")).thenReturn("muthaiya");
     when(request.getParameter("lname")).thenReturn("muthaiya");

      StringWriter stringWriter = new StringWriter();
      PrintWriter writer = new PrintWriter(stringWriter);
      when(response.getWriter()).thenReturn(writer);

      new ServletRegistration().doPost(request, response);

      verify(request, atLeast(1)).getParameter("lname"); // only if you want to verify username was called...
      writer.flush(); // it may not have been flushed yet...
      assertTrue(stringWriter.toString().contains("muthaiya"));
    }

  


    
}
