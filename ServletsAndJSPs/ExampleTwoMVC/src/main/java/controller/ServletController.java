package controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Rectangulo;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //1. Procesar los parametros
        String accion = request.getParameter("accion");

        //2. Creamos los JavaBeans
        Rectangulo rectanguloRequest = new Rectangulo(1, 2);
        Rectangulo rectanguloSession = new Rectangulo(3, 4);
        Rectangulo rectanguloApp = new Rectangulo(5, 6);

        //3. Agregamos el JavaBean a algun alcance
        //3.1. Revisar la acción proporcionada
        if ("addVariables".equals(accion)) {
            //Alcance request
            request.setAttribute("rectanguloSession", rectanguloSession);
            //Alcance session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", rectanguloSession);

            //Alcance app
            ServletContext app = this.getServletContext();
            app.setAttribute("rectanguloApp", rectanguloApp);

            //Agregar un mensage
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            //4. redireccionar a index.jsp
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("listVariables".equals(accion)) {
            //4. Redireccionar al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/ScopeVar.jsp").forward(request, response);
        } else {
            //4. Redireccionar al index
            request.setAttribute("mensaje", "Acción no proporcionada");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
