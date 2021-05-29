package com.scope;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ScopeServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("name");
        if (userName != null) {
            req.setAttribute("userName",userName);
            HttpSession session = req.getSession();
            session.setAttribute("userName", userName);
            ServletContext context = getServletContext();
            context.setAttribute("userName", userName);
        }
        req.getRequestDispatcher("index.jsp").forward(req, res);

    }

}
