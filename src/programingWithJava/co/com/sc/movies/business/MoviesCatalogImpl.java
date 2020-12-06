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
import programingWithJava.co.com.sc.movies.exeptions.WritingDataEx;

/**
 *
 * @author sc
 */
public class MoviesCatalogImpl implements MovieCatalog {

    public MoviesCatalogImpl() {
        System.out.println("Catalog create");
    }

    @Override
    public void addMovie(String nameMovie, String fileName) {
        PrintWriter output = null;
        File file = new File(fileName);
        try {
            output = new PrintWriter(new FileWriter(fileName, true));
            output.println(new Date() + " ### " + nameMovie);
            System.out.println("Add movie to file");
        } catch (WritingDataEx ex) {
            System.out.println(ex.getMessage());
            output.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            output.close();
        }
    }

    @Override
    public void listMovies(String fileName) {
        BufferedReader input = null;
        File file = new File(fileName);
        try {
            input = new BufferedReader(new FileReader(file));
            String reader = input.readLine();
            int line = 1;
            while (reader != null) {
                System.out.println((line++) + "° movie = " + reader);
                reader = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void findMovie(String fileName, String find) {
        BufferedReader input = null;
        File file = new File(fileName);
        try {
            input = new BufferedReader(new FileReader(file));
            String reader = input.readLine();
            int line = 0;
            while (reader != null) {
                if (find.equalsIgnoreCase(reader.substring(33, reader.length()))) {
                    System.out.println((++line) + "° movie = " + reader);
                }
                reader = input.readLine();
            }
            System.out.println(line+" Registros encontrados");
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void startFile(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
