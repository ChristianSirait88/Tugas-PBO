/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author Christian Sirait
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    
    static Connection con;

    public static Connection connection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("barang");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }
}
    

