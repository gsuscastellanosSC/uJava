package programingWithJava.co.com.sc.movies.domain;

import java.io.Serializable;

/**
 *
 * @author sc
 */
public class Movie implements Serializable {

    private String name;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    
}
