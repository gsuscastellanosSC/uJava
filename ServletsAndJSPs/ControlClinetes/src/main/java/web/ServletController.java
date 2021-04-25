package web;

import data.ClienteDaoJDBC;
import model.Cliente;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editClient(request, response);
                    break;
                default:
                    defaultAction(request, response);
            }
        } else {
            defaultAction(request, response);
        }
    }
    
    private void defaultAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        HttpSession session = request.getSession();
        session.setAttribute("clientes", clientes);
        session.setAttribute("totalClientes", clientes.size());
        session.setAttribute("saldoTotal", calculateTotal(clientes));
        response.sendRedirect("clientes.jsp");
    }
    
    private double calculateTotal(List<Cliente> clientes) {
        double saldoTotal = 0;
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insert":
                    this.insertClient(request, response);
                    break;
                case "update":
                    this.updateClient(request, response);
                    break;
                default:
                    defaultAction(request, response);
            }
        } else {
            defaultAction(request, response);
        }
    }
    
    private void insertClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo;
        String saldoString = request.getParameter("saldo");
        saldo = (saldoString != null && !"".equals(saldoString)) ? Double.parseDouble(saldoString) : 0;

        //Creamos el objeto cliente (modelo)
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);

        //Creamos el objeto en la base de datos
        int RegistrosModificados = new ClienteDaoJDBC().insertar(cliente);

        //Redirigimos hacia acción por default
        this.defaultAction(request, response);
    }
    
    private void editClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperamos el idCliente
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));

        //recuperamos los valores del formulario editarCliente
        Cliente cliente = new ClienteDaoJDBC().findToClient(new Cliente(idCliente));
        request.setAttribute("cliente", cliente);
        String jspEditar = "/WEB-INF/pages/cliente/editClient.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }
    
    private void updateClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recuperamos lso valores del formulario editClient
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo;
        String saldoString = request.getParameter("saldo");
        saldo = (saldoString != null && !"".equals(saldoString)) ? Double.parseDouble(saldoString) : 0;

        //Creamos el objeto cliente (modelo)
        Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);

        //Creamos el objeto en la base de datos
        int RegistrosModificados = new ClienteDaoJDBC().update(cliente);

        //Redirigimos hacia acción por default
        this.defaultAction(request, response);
    }
}
