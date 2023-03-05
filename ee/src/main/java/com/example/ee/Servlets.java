package com.example.ee;

import java.io.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

@WebServlet("/searchGenre")
public class Servlets extends HttpServlet {
    private String Genre;
    private String Name;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        PrintWriter writer = response.getWriter();
        Genre = request.getParameter("inputGenre");
        Name = request.getParameter("inputName");
        Genre.toLowerCase();
        String text ="";
        String everything;
        String filename = "/sbornik/" + Genre + "/" + Name +".txt";
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(filename);
        response.setContentType("text/html; charset=UTF-16");

        writer.println("<HTML>");
        writer.println("<!DOCTYPE html>");
        writer.println("<HEAD>");
        writer.println("</HEAD>");
        writer.println("<BODY> <center>");
        writer.println("<H3>Query by genre: " + Genre + "</H3><BR/>");
        writer.println("<H3>Name of query:" + Name + "</H3>");

        if (is != null)
        {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);

            while ((everything = reader.readLine()) != null)
            {
                text += everything;
            }
        }

        writer.println(text);
        writer.println("</center></BODY></HTML>");
    }
}