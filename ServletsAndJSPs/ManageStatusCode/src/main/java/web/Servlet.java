package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UserQV
 */
@WebServlet("/manageStatusCode")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simulando los valores correctos
        String userSuccessful = "Juan";
        String passwordSuccessfull = "123";

        String user = request.getParameter("user");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (userSuccessful.equals(user) && passwordSuccessfull.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + user);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas.");
        }
    }

}
