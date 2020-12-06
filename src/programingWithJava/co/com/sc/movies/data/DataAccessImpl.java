/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import programingWithJava.co.com.sc.movies.domain.Movie;
import programingWithJava.co.com.sc.movies.exeptions.DataAccessEx;
import programingWithJava.co.com.sc.movies.exeptions.ReadingDataEx;
import programingWithJava.co.com.sc.movies.exeptions.WritingDataEx;

/**
 *
 * @author sc
 */
public class DataAccessImpl implements DataAccess {

    @Override
    public boolean exists(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        return file.exists();
    }

    @Override
    public List<Movie> list(String fileName) throws ReadingDataEx {
        File file = new File(fileName);
        List<Movie> movies = new ArrayList<>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = null;
            line = input.readLine();
            while (line != null) {
                movies.add(new Movie(line));
                line = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadingDataEx("Excepcion al listar peliculas" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadingDataEx("Excepcion al listar peliculas" + ex.getMessage());
        }
        return movies;
    }

    @Override
    public void writing(Movie movie, String fileName, boolean append) throws WritingDataEx {
        try {
            File file = new File(fileName);
            PrintWriter output = new PrintWriter(new FileWriter(file, append));
            output.print(movie.toString());
            output.close();
            System.out.println("La pelicula: " + movie + " se agrego correctamente en el archivo: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new WritingDataEx("Excepcion al gurdar pelicula." + ex.getMessage());
        }
    }

    @Override
    public String find(String fileName, String find) throws ReadingDataEx {

    }

    @Override
    public void create(String fileName) throws DataAccessEx {

    }

    @Override
    public void delete(String fileName) throws DataAccessEx {

    }

}
