/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.business;

import programingWithJava.co.com.sc.movies.data.DataAccessImpl;
import programingWithJava.co.com.sc.movies.data.DataAccess;
import programingWithJava.co.com.sc.movies.domain.Movie;
import programingWithJava.co.com.sc.movies.exeptions.DataAccessEx;

/**
 *
 * @author sc
 */
public class MoviesCatalogImpl implements MovieCatalog {

    private final DataAccess data;

    public MoviesCatalogImpl(DataAccess data) {
        this.data = new DataAccessImpl();
    }

    @Override
    public void addMovie(String nameMovie) {
        Movie movie = new Movie(nameMovie);
        try {
            boolean append = data.exists(FILENAME);
            data.writing(movie, FILENAME, append);
        } catch (DataAccessEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listMovies() {
        try {
            var movies = this.data.list(FILENAME);
            for (var movie : movies) {
                System.out.println("pelicula = " + movie);
            }
        } catch (DataAccessEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void findMovie(String find) {
        String result = null;
        try {
            result = this.data.find(FILENAME, find);
        } catch (DataAccessEx ex) {
            System.out.println("Error de acceso" + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + result);
    }

    @Override
    public void startCatalogMovies() {
        try {
            if (this.data.exists(FILENAME)) {
                data.delete(FILENAME);
                data.create(FILENAME);
            } else {
                data.create(FILENAME);
            }
        } catch (DataAccessEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

}
