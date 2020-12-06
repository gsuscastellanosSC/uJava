/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import programingWithJava.co.com.sc.movies.data.DataAccessImpl;
import programingWithJava.co.com.sc.movies.exeptions.WritingDataEx;
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

    }

    @Override
    public void findMovie(String find) {

    }

    @Override
    public void startCatalogMovies(String fileName) {

    }

}
