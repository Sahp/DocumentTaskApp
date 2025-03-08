package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DocumentTaskServlet")
public class DocumentTaskServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<String> documents = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("<h3>Documents:</h3><ul>");
        for (String doc : documents) {
            response.getWriter().write("<li>" + doc + "</li>");
        }
        response.getWriter().write("</ul><h3>Tasks:</h3><ul>");
        for (String task : tasks) {
            response.getWriter().write("<li>" + task + "</li>");
        }
        response.getWriter().write("</ul>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("upload".equals(action)) {
            String docName = request.getParameter("docName");
            documents.add(docName);
        } else if ("assign".equals(action)) {
            String taskName = request.getParameter("taskName");
            tasks.add(taskName);
        }
        doGet(request, response); // Hiển thị lại danh sách
    }
}