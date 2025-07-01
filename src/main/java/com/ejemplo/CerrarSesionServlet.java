package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class CerrarSesionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Sesión cerrada</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background: #f0f0f0; padding: 40px; text-align: center; }");
        out.println(".mensaje { background: white; padding: 30px; border-radius: 12px; box-shadow: 0 0 10px rgba(0,0,0,0.1); max-width: 500px; margin: auto; }");
        out.println("h2 { color: #333; }");
        out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; color: white; background: #28a745; padding: 10px 20px; border-radius: 6px; }");
        out.println("a:hover { background: #218838; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='mensaje'>");
        out.println("<h2>👋 Has cerrado sesión exitosamente</h2>");
        out.println("<p>Gracias por visitarnos. ¡Te esperamos pronto!</p>");
        out.println("<a href='index.html'>Volver a inicio</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
