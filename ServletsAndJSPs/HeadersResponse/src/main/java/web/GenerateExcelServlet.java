/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author SC
 */
@WebServlet("/GenerateExcelServlet")
public class GenerateExcelServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Indicar el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel;");
        response.setHeader("content-Disposition", "attachemment;filename=excelExample.xls");
        //para un uso más profesional de excel poi.apache.org
        
        //indicar al navegador que no guarde cache
        response.setHeader("pragma", "no-cache");
        response.setHeader("cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //desplegamos la información al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
    }
    
}
