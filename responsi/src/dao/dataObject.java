/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.koneksi;
import Model.barang;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian Sirait
 */
public class dataObject implements intBarang{
    Connection connection;
    final String insert = "INSERT INTO barang (nama,massa,harga) VALUES (?, ?, ?);";
    final String update = "UPDATE barang SET nama=?, massa=?, harga=? WHERE id=? ;";
    final String delete = "DELETE FROM barang WHERE id=? ;";
    final String select = "SELECT * FROM barang ORDER BY id DESC;";

    public dataObject(Connection connection) {
        this.connection = koneksi.connection();
    }

    
    @Override
    public void add(barang barang) {
        PreparedStatement statement = null;
         try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, barang.getNama());
            statement.setDouble(2, barang.getMassa());
            statement.setDouble(3, barang.getHarga());
            statement.executeUpdate();
             System.out.println("test");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(barang barang) {
        PreparedStatement statement = null;
         try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, barang.getNama());
            statement.setDouble(2, barang.getMassa());
            statement.setDouble(3, barang.getHarga());
            statement.setInt(4, barang.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
      PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<barang> getBarang() {
        List<barang> listBarang = null;
        try {
            listBarang = new ArrayList<barang>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                barang brg =new barang();
                brg.setId(rs.getInt("id"));
                brg.setNama(rs.getString("nama"));
                brg.setMassa(rs.getInt("massa"));
                brg.setHarga(rs.getLong("harga"));
                listBarang.add(brg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataObject.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listBarang;
    
    }
    
}
