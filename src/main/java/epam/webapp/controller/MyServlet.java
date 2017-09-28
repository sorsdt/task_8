package epam.webapp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet", urlPatterns = {"/form"}, loadOnStartup = 1)
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ((request.getParameter("rows") == null) || (request.getParameter("cols") == null)) {
            getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/table.jsp").forward(request, response);
        }
    }
}