package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionBD {

    private static final String JDBC_URL = "jdbc:mysql://gsuscastelsc.com:3306/databaseControlClientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "example";

    public static DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(JDBC_URL);
        basicDataSource.setUsername(JDBC_USER);
        basicDataSource.setPassword(JDBC_PASSWORD);
        basicDataSource.setInitialSize(50);
        return basicDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet resulSet) {
        try {
            resulSet.close();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement preparedStament) {
        try {
            preparedStament.close();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        }
    }

    public static void close(Connection connectionBD) {
        try {
            connectionBD.close();
        } catch (SQLException sQLException) {
            sQLException.printStackTrace(System.out);
        }
    }
}
