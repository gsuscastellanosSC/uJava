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
 * @author Sc
 */
@WebServlet("/CookiesVisitsCounterServlet")
public class CookiesVisitsCounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Declarar un ac
        int acc = 0;

        //Revisamos si existe la cookie contadorvisitas
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("contadorvisitas")) {
                acc = Integer.parseInt(c.getValue());
            }
        }

        //Incrementar el valor en uno
        acc++;

        //Agregar la respuesta al navegador
        Cookie c = new Cookie("contadorvisitas", Integer.toString(acc));
        //la cookie se almacenara en el cliente por una hora (3600s )
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Enviar respuesta al navegador
        response.setContentType("text/html;charset-UTF8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente:" + acc);
    }
}
