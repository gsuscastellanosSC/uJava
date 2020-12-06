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

    String FILENAME = "Catalog/peliculas.txt";

    public void addMovie(String nameMovie);

    public void listMovies();

    public void findMovie(String find);

    public void startCatalogMovies(String fileName);
}
