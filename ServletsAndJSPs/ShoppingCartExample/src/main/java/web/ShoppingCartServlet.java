package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sc
 */
@WebServlet("/ShoppingCartExampleServlet")
public class ShoppingCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset-UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //recuperar la lista de articulos agregados previamente si existen
        List<String> articles = (List<String>) sesion.getAttribute("article");

        //Verificamos si la lista de articulos existe
        if (articles == null) {
            articles = new ArrayList<>();
            sesion.setAttribute("article", articles);
        }

        //procesar el nuevo articulo
        String newArticle = request.getParameter("article");

        //Revisamos y agregamos el articulo nuevo
        if (newArticle != null && !newArticle.trim().equals("")) {
            articles.add(newArticle);
        }
        try (PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            //Iteramos todos los articulos
            for (String article : articles) {
                out.print("<li>" + article + "</li>");
            }
            //agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='index.html'>Regresar al inicio</a>");
        }
    }

}
