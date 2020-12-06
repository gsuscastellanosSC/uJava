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
            throw new ReadingDataEx("Excepcion al listar peliculas " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadingDataEx("Excepcion al listar peliculas " + ex.getMessage());
        }
        return movies;
    }

    @Override
    public void writing(Movie movie, String fileName, boolean append) throws WritingDataEx {
        try {
            File file = new File(fileName);
            PrintWriter output = new PrintWriter(new FileWriter(fileName, true));
            output.println(movie.toString());
            output.close();
            System.out.println("La pelicula: " + movie + " se agrego correctamente en el archivo: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new WritingDataEx("Excepcion al gurdar pelicula " + ex.getMessage());
        }
    }

    @Override
    public String find(String fileName, String find) throws ReadingDataEx {
        String result = null;
        try {
            File file = new File(fileName);
            BufferedReader input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            int index = 1;
            while (line != null) {
                if (find != null && find.equalsIgnoreCase(line)) {
                    result = "Pelicula" + line + " encontrada en el indice " + index;
                    //break;
                }
                line = input.readLine();
                index++;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadingDataEx("Excepcion al buscar pelicula " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadingDataEx("Excepcion al buscar pelicula " + ex.getMessage());
        }
        return result;
    }

    @Override
    public void create(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("Archivo " + fileName + " creado correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new DataAccessEx("Error al crear archivo " + ex.getMessage());
        }

    }

    @Override
    public void delete(String fileName) throws DataAccessEx {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        System.out.println("El archivo " + fileName + "fue borrado");
    }

}
