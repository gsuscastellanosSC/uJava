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
 * @author sc
 */
@WebServlet("/main")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Leer params form in index.html
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        System.out.println("user = " + user);
        System.out.println("password = " + password);

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro user es: " + user);
        out.print("<br/>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }

}
