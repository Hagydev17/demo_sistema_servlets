package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user-menu-helados")
public class MenuHeladosUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("usuario");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false); // false: no crear si no existe
        String username1 = (session != null) ? (String) session.getAttribute("username") : "Invitado";


        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <title>Title</title>");
        out.println("    <link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header class='header-menu'>");
        out.println("    <h2>¡Hola "+ username1 +"! Descubre tu sabor favorito</h2>");
        out.println("    <p>Explora nuestra variedad de helados, toppings y tamaños. ¡Hay uno perfecto para ti!</p>");
        out.println("    <a href='index.html'>Volver a inicio</a>");
        out.println("</header>");
        out.println("<section class='contenedor-menu'>");

        // Producto 1: Helado en vaso
        out.println("<div class='div1-menu'>");
        out.println("    <img src='img/img1.jpg' alt='helado en vaso' width='300px' height='300px' style='border-radius: 10px;'>");
        out.println("    <div class='contenedor-helados'>");
        out.println("        <h4>Helado en vaso</h4>");
        out.println("        <p>Disfruta de nuestro delicioso helado servido en un elegante vaso, combínalo con tus sabores favoritos. Perfecto para disfrutar en el lugar, con una textura cremosa y sabores irresistibles que degustan tu paladar en cada cucharada.</p>");
        out.println("        <ul>");
        out.println("            <li><strong>Chico:</strong> <span>$40</span></li>");
        out.println("            <li><strong>Mediano:</strong> <span>$55</span></li>");
        out.println("            <li><strong>Grande:</strong> <span>$70</span></li>");
        out.println("        </ul>");
        out.println("        <a href='\" + req.getContextPath() + \"/pedir-helado'>Ordene aquí</a>");
        out.println("    </div>");
        out.println("</div>");

        // Producto 2: Helado en plato
        out.println("<div class='div2-menu'>");
        out.println("    <img src='img/img2.jpg' alt='helado en plato' width='300px' height='300px' style='border-radius: 10px;'>");
        out.println("    <div class='contenedor-helados'>");
        out.println("        <h4>Helado en plato</h4>");
        out.println("        <p>Helado servido por rebanadas, elige las que más te gusten. Combínalo con tus sabores favoritos y agrega complementos para hacerlo más delicioso. El toque perfecto entre cremosidad y elegancia.</p>");
        out.println("        <ul>");
        out.println("            <li><strong>Chico:</strong> <span>$55</span></li>");
        out.println("            <li><strong>Mediano:</strong> <span>$65</span></li>");
        out.println("            <li><strong>Grande:</strong> <span>$80</span></li>");
        out.println("        </ul>");
        out.println("        <a href='pedir-helado'>Ordene aquí</a>");
        out.println("    </div>");
        out.println("</div>");

        // Producto 3: Helado con galletas
        out.println("<div class='div3-menu'>");
        out.println("    <img src='img/img3.jpg' alt='helado con galletas' width='300px' height='300px' style='border-radius: 10px;'>");
        out.println("    <div class='contenedor-helados'>");
        out.println("        <h4>Helado con galletas</h4>");
        out.println("        <p>Una deliciosa combinación de cremoso helado acompañado por crujientes galletas. Perfecto para los amantes del dulce, este postre combina lo mejor de dos mundos: suavidad y crocancia en una sola experiencia.</p>");
        out.println("        <ul>");
        out.println("            <li><strong>Chico:</strong> <span>$40</span></li>");
        out.println("            <li><strong>Mediano:</strong> <span>$55</span></li>");
        out.println("            <li><strong>Grande:</strong> <span>$70</span></li>");
        out.println("        </ul>");
        out.println("        <a href='pedir-helado'>Ordene aquí</a>");
        out.println("    </div>");
        out.println("</div>");

        // Producto 4: Helado en cono
        out.println("<div class='div4-menu'>");
        out.println("    <img src='img/img4.jpg' alt='helado en cono' width='300px' height='300px' style='border-radius: 10px;'>");
        out.println("    <div class='contenedor-helados'>");
        out.println("        <h4>Helado en cono</h4>");
        out.println("        <p>El clásico que nunca pasa de moda. Disfruta tu helado servido en un crujiente cono que complementa perfectamente cada bocado. Ideal para llevar y saborear en cualquier momento con estilo y sabor.</p>");
        out.println("        <ul>");
        out.println("            <li><strong>Chico:</strong> <span>$25</span></li>");
        out.println("            <li><strong>Mediano:</strong> <span>$35</span></li>");
        out.println("            <li><strong>Grande:</strong> <span>$45</span></li>");
        out.println("        </ul>");
        out.println("        <a href='pedir-helado'>Ordene aquí</a>");
        out.println("    </div>");
        out.println("</div>");

        out.println("</section>");
        out.println("</body>");
        out.println("</html>");
    }
}
