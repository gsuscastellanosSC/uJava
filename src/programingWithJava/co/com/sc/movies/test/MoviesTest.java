/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.test;

import java.util.Scanner;
import javax.xml.catalog.Catalog;
import programingWithJava.co.com.sc.movies.business.MovieCatalog;
import programingWithJava.co.com.sc.movies.business.MoviesCatalogImpl;

/**
 *
 * @author sc
 */
public class MoviesTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String fileName;
        MovieCatalog movieCatalog = null;

        do {
            System.out.println("\n\n");
            System.out.println("##############################");
            System.out.println("\nElige opción:");
            System.out.println("    1.-Inicia catalogo peliculas");
            System.out.println("    2.-Agregar Peliculas");
            System.out.println("    3.-Listar Peliculas");
            System.out.println("    4.-Buscar Pelicula");
            System.out.println("    0.-Salir");
            System.out.println("##############################");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    movieCatalog = validateMovieCatalog(movieCatalog);
                    break;
                case 2:
                    movieCatalog = validateMovieCatalog(movieCatalog);
                    System.out.println("\nIntroduce el nombre de una pelicula a agregar:");
                    fileName = sc.nextLine();
                    movieCatalog.addMovie(fileName, "/home/sc/Documents/github/uJava/Catalog/movies.txt");
                    break;
                case 3:
                    movieCatalog = validateMovieCatalog(movieCatalog);
                    movieCatalog.listMovies("/home/sc/Documents/github/uJava/Catalog/movies.txt");
                    break;
                case 4:
                    movieCatalog = validateMovieCatalog(movieCatalog);
                    System.out.println("\nIntroduce el nombre de una pelicula a buscar:");
                    fileName = sc.nextLine();
                    movieCatalog.findMovie("/home/sc/Documents/github/uJava/Catalog/movies.txt", fileName);
                    break;
                case 0:
                    System.out.println("\nTerminando la app...");
                    System.out.println("Su sessión finalizo correctamente");
                    break;
                default:
                    System.out.println("\nLa opción: " + option + ", no es valida.");
            }
        } while (option != 0);
    }

    public static MovieCatalog validateMovieCatalog(MovieCatalog movieCatalog) {
        return (movieCatalog == null) ? new MoviesCatalogImpl() : movieCatalog;
    }
}
