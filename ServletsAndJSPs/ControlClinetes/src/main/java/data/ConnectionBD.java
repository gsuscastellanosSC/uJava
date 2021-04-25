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

    private static BasicDataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            BasicDataSource basicDataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(50);
        }
        return dataSource;
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
