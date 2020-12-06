/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.test;

import java.util.Scanner;
import javax.xml.catalog.Catalog;
import programingWithJava.co.com.sc.movies.business.MovieCatalog;

/**
 *
 * @author sc
 */
public class MoviesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String fileName;
        MovieCatalog movieCatalog;
        
        do {            
            System.out.println("Elige opción:");
            System.out.println("1.-Inicia catalogo peliculas");
            System.out.println("2.-Agregar Peliculas");
            System.out.println("3.-Listar Peliculas");
            System.out.println("4.-Buscar Pelicula");
            System.out.println("0.-Salir");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    System.out.println(option);
                    break;
                case 2:
                    System.out.println(option);
                    break;
                case 3:
                    System.out.println(option);
                    break;
                case 4:
                    System.out.println(option);
                    break;
                case 0:
                    System.out.println(option);
                    break;
                default:
                    System.out.println("La opción: "+option+", no es valida.");
            }
        } while (option != 0);
    }
}
