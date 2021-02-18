package com.example.Servlet_Tomcat;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "sumServlet", value = "/sum-servlet")
public class StudentServlet extends HttpServlet {
    private String message;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        if (request.getParameter("num1") != "" && request.getParameter("num1") != "" ) {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
            response(response, String.valueOf(sum));
        }else{
            response(response, "Invalid");
        }
    }
    private void response(HttpServletResponse resp, String result)
            throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<t1> The sum is - " + result + "</t1>");
        out.println("</body>");
        out.println("</html>");
    }
    public void destroy() {
    }
}