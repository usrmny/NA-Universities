package bmt;

import com.microsoft.sqlserver.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class naUniversities {
    public static void main(String[] args){

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


        try {

            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String url = "jdbc:sqlserver://localhost:3306/personal";
            String user = "root";
            String pass = "K&se2menksd!95r";
            
            Connection connection = DriverManager.getConnection(url, user, pass);
            
            if (connection != null) {
                System.out.println("The connection has been successfully established.");
                
                DatabaseMetaData dm = connection.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            System.out.println("An error occurred while establishing the connection:");
            ex.printStackTrace();
        }
    }
} //gotta install a more recent version of java for this to work
