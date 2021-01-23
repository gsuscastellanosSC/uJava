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
@WebServlet("/form")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charter=UTF8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String tec[] = request.getParameterValues("tec");
        String genero = request.getParameter("genero");
        String ocupation = request.getParameter("ocupation");
        String musica [] = request.getParameterValues("musica");
        String coments = request.getParameter("coments");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(user);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologías");
        out.print("</td>");
        out.print("<td>");

        for (String tecnologia : tec) {
            out.print(tecnologia);
            out.print(", ");
        }

        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Género");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupación");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupation);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Música Favorita");
        out.print("</td>");
        out.print("<td>");

        if (musica != null) {
            for (String m : musica) {
                out.print(m);
                out.print(" / ");
            }
        }
        else{
            out.print("Valor no proporcionado");
        }

        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print(coments);
        out.print("</td>");
        out.print("</tr>");

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }

}
