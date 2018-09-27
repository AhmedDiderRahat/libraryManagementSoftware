package edu.neub.cse.project1.connection;

/**
 *
 * @author Team_DoodleArmy
 */
import java.sql.*;

public class DbConnector {

    public Connection connection;
    public Statement statement;
    public ResultSet resultset;

    public DbConnector() {

        try {
            Class.forName(Constants.JDBC_DRIVER);
            connection = DriverManager.getConnection(Constants.LM_DB, Constants.LM_DB_USERNAME,
                    Constants.LM_DB_PASSWORD);
            statement = connection.createStatement();
        } //end try
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
