package programingWithJava.co.com.sc.movies.data;

import java.util.List;
import programingWithJava.co.com.sc.movies.domain.Movie;
import programingWithJava.co.com.sc.movies.exeptions.DataAccessEx;
import programingWithJava.co.com.sc.movies.exeptions.ReadingDataEx;
import programingWithJava.co.com.sc.movies.exeptions.WritingDataEx;

/**
 *
 * @author sc
 */
public interface DataAccess {

    public boolean exists(String fileName) throws DataAccessEx;

    public List<Movie> list(String fileName) throws ReadingDataEx;

    public void writing(Movie movie, String fileName, boolean append) throws WritingDataEx;

    public String find(String fileName, String find) throws ReadingDataEx;

    public void create(String fileName) throws DataAccessEx;

    public void delete(String fileName) throws DataAccessEx;

}
