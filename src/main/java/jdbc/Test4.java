package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class Test4 {

    public static void main(String[] args) {
        try(Connection conn = JdbcUtil.getConnection()){
            String sql = "{call saveuser(?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, "bob");
            cs.setInt(2, 11);
            cs.execute();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
