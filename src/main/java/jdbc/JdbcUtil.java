package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/usc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Zr5e5%1010,,,";

    //use ur own username and password and url!!!


    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(Exception e){
            System.err.println(e);
        }
        return conn;
    }

}
