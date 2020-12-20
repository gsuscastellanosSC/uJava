package programingWithJava.co.com.sc.movies.presentation;

import java.util.Scanner;
import programingWithJava.co.com.sc.movies.business.MovieCatalog;
import programingWithJava.co.com.sc.movies.business.MoviesCatalogImpl;

/**
 *
 * @author sc
 */
public class PresentationCatalogMovies {

    public static void main(String[] args) {
        int option = -1;
        Scanner sc = new Scanner(System.in);
        MovieCatalog catalog = new MoviesCatalogImpl();
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
                    catalog.startCatalogMovies();
                    break;
                case 2:
                    System.out.println("\nIntroduce el nombre de una pelicula a agregar:");
                    String nameMovie = sc.nextLine();
                    catalog.addMovie(nameMovie);
                    break;
                case 3:
                    catalog.listMovies();
                    break;
                case 4:
                    System.out.println("\nIntroduce el nombre de una pelicula a buscar:");
                    String nameMovieFind = sc.nextLine();
                    catalog.findMovie(nameMovieFind);    
                    break;
                case 0:
                    System.out.println("\nTerminando la app...");
                    System.out.println("Su sessión finalizo correctamente");
                    break;
                default:
                    System.out.println("\nLa opción: " + option + ", no es valida.");
                    break;
            }
        } while (option != 0);
    }
}
