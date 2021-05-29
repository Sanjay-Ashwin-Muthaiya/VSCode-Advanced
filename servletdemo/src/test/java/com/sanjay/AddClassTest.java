package com.sanjay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;

public class AddClassTest {

    @Test
    public void calculatePosDate_Test() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        // Way to set parameter in servlet
          when(req.getParameter("date_Num")).thenReturn("2");

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(res.getWriter()).thenReturn(writer);

        new AddClass().service(req, res);

        verify(req, atLeast(1)).getParameter("date_Num");
        writer.flush();
        Calendar calen = Calendar.getInstance();
        calen.add(Calendar.DATE,2);
        Date d = calen.getTime();
        String s = d.toString();
        assertTrue(stringWriter.toString().contains(s));
    }
    @Test
    public void calculateNegDate_Test() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        // Way to set parameter in servlet
          when(req.getParameter("date_Num")).thenReturn("-4");

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(res.getWriter()).thenReturn(writer);

        new AddClass().service(req, res);

        verify(req, atLeast(1)).getParameter("date_Num");
        writer.flush();
        Calendar calen = Calendar.getInstance();
        calen.add(Calendar.DATE,-4);
        Date d = calen.getTime();
        String s = d.toString();
        assertTrue(stringWriter.toString().contains(s));
    }

}
