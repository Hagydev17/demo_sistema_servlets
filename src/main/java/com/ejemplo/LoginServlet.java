package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String usuario = req.getParameter("usuario");

        HttpSession session = req.getSession();
        session.setAttribute("username", usuario);

        String username = req.getParameter("usuario");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
            out.println("<head><meta charset='UTF-8'><title>Bienvenido</title></head>");
            out.println("<body>");

            boolean hayErrores = false;

            if (username == null || username.trim().isEmpty()) {
                out.println("<p style='color:red;'>⚠️ El nombre de usuario es obligatorio.</p>");
                hayErrores = true;
            }

            if (password == null || password.trim().isEmpty()) {
                out.println("<p style='color:red;'>⚠️ La contraseña es obligatoria.</p>");
                hayErrores = true;
            }

            if (!hayErrores) {
                out.println("<!DOCTYPE html>");
                out.println("<html lang='es'>");
                out.println("<head>");
                out.println("<meta charset='UTF-8'>");
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                out.println("<title>Bienvenido</title>");
                out.println("<style>");
                out.println("body { font-family: Arial, sans-serif; background: #f2f2f2; margin: 0; padding: 0; }");
                out.println(".perfil-container { padding: 40px; background: white; max-width: 600px; margin: 50px auto; border-radius: 15px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
                out.println("h1 { color: #333; }");
                out.println(".menu { margin-top: 30px; display: flex; gap: 15px; flex-wrap: wrap; }");
                out.println(".menu a { padding: 10px 20px; background: #007BFF; color: white; text-decoration: none; border-radius: 8px; transition: background 0.3s; }");
                out.println(".menu a:hover { background: #0056b3; }");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");

                out.println("<div class='perfil-container'>");
                out.println("<h1>¡Bienvenido, " + username + "!</h1>");
                out.println("<p>Te has conectado exitosamente. ¿Qué deseas hacer hoy?</p>");

                out.println("<div class='menu'>");
                out.println("<a href='user-menu-helados'>Ver Menú de Helados</a>");
                out.println("<a href='mis-pedidos'>Mis Pedidos</a>");
                out.println("<a href='logout'>Cerrar Sesión</a>");
                out.println("</div>");

                out.println("</div>");

                out.println("</body>");
                out.println("</html>");
            }

            out.println("</body></html>");
        }
    }
}
