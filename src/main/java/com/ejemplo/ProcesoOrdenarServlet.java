package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/proceso-ordenar")
public class ProcesoOrdenarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipo = req.getParameter("tipo");
        String cantidad = req.getParameter("cantidad-tipo");
        String sabor = req.getParameter("sabor");

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("    <title>Confirmación de Pedido</title>");
            out.println("    <style>");
            out.println("        body {");
            out.println("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
            out.println("            background: #f0f4f8;");
            out.println("            display: flex;");
            out.println("            justify-content: center;");
            out.println("            align-items: center;");
            out.println("            height: 100vh;");
            out.println("            margin: 0;");
            out.println("        }");
            out.println("        .pedido-container {");
            out.println("            background: white;");
            out.println("            padding: 30px 40px;");
            out.println("            border-radius: 15px;");
            out.println("            box-shadow: 0 8px 20px rgba(0,0,0,0.1);");
            out.println("            width: 400px;");
            out.println("            text-align: center;");
            out.println("        }");
            out.println("        h1 {");
            out.println("            color: #333;");
            out.println("            margin-bottom: 20px;");
            out.println("        }");
            out.println("        p {");
            out.println("            font-size: 18px;");
            out.println("            color: #555;");
            out.println("            margin: 10px 0;");
            out.println("        }");
            out.println("        a {");
            out.println("            display: inline-block;");
            out.println("            margin-top: 25px;");
            out.println("            padding: 12px 25px;");
            out.println("            background-color: #007BFF;");
            out.println("            color: white;");
            out.println("            text-decoration: none;");
            out.println("            border-radius: 8px;");
            out.println("            font-weight: 600;");
            out.println("            transition: background-color 0.3s ease;");
            out.println("        }");
            out.println("        a:hover {");
            out.println("            background-color: #0056b3;");
            out.println("        }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='pedido-container'>");
            out.println("<h1>¡Pedido Confirmado!</h1>");
            out.println("<p><strong>Tipo de helado:</strong> " + tipo + "</p>");
            out.println("<p><strong>Cantidad:</strong> " + cantidad + "</p>");
            out.println("<p><strong>Sabor:</strong> " + sabor + "</p>");
            out.println("<a href='menuhelados.html'>Volver al Menú</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
