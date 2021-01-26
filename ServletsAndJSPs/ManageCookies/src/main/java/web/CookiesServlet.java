package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SC
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Suponemos que el usuario visita por primera vez nuestro sitio
        boolean newUser = true;

        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //Buscamos si ya existe una cookie creada con anterioridad
        //Llamada visitanteRcurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("Si")) {
                    //Si ya existe la cookie es un usuario recurrente
                    newUser = false;
                    break;
                }
            }
        }

        String message = null;
        if (newUser) {
            Cookie callVisitor = new Cookie("visitanteRecurrente", "Si");
            response.addCookie(callVisitor);
            message = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            message = "Gracias por visitar nuevamente nuestro sitio";
        }
        response.setContentType("text/html;charset-UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje" + message);
    }
}
