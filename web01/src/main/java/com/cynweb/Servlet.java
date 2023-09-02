package com.cynweb;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 程亚宁
 * @version 1.0
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
    response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println("Hello程亚宁");
        pw.flush();
        pw.close();
    }
}
