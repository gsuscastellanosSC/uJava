package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
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
@WebServlet("/ExampleHttpSession")
public class ExampleHttpSessionServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        String title = null;
        
        //Pedir el atributo contadorVisitas a las session
        Integer visitsCounter = (Integer) sesion.getAttribute("contadorVisitas");
        //Si es nulo es la primera vez que accedemos a la aplicación
        if (visitsCounter == null) {
            visitsCounter = 1;
            title = "Bienvenido por primera vez";
        } else {
            visitsCounter++;
            title = "Bienvenido nuevamente";
        }
        //Agregamos en nuevo valor del contadoVisitas a la session.
        sesion.setAttribute("contadorVisitas", visitsCounter);

        //Enviamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(title);
        out.print("<br>");
        out.print("no. accesos al recurso" + visitsCounter);
        out.print("<br>");
        out.print("ID de la session:" + sesion.getId());
        out.print("<br>");
        out.print(sesion.toString());
        out.close();
    }
    
}
