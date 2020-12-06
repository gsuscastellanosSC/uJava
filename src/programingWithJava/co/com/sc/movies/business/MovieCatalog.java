/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programingWithJava.co.com.sc.movies.business;

/**
 *
 * @author sc
 */
public interface MovieCatalog {

    public void addMovie(String nameMovie, String fileName);

    public void listMovies(String fileName);

    public void findMovie(String nameFile, String find);

    public void startFile(String fileName);
}
