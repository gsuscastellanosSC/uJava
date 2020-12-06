package programingWithJava.co.com.sc.movies.data;

import java.util.List;
import programingWithJava.co.com.sc.movies.domain.Movie;

/**
 *
 * @author sc
 */
public interface DataAccess {

    public boolean exists(String fileName);

    public List<Movie> list(String fileName);

    public void writing(Movie movie, String fileName, boolean append);

    public String find(String fileName, String find);

    public void create(String fileName);

    public void delete(String fileName);

}
