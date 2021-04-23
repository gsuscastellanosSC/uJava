package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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

        //2. Creamos los JavaBeans
        Rectangulo rectangulo = new Rectangulo(3, 6);

        //3. Agregamos el JavaBean a algun alcance
        request.setAttribute("message", "Saludos desde el servlet Controller");

        HttpSession session = request.getSession();
        session.setAttribute("rectangulo", rectangulo);

        //4. Redireccionar a la vista seleccionada
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/DispatcherVar.jsp");
        requestDispatcher.forward(request, response);
    }
}
