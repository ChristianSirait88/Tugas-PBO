/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
/**
 *
 * @author Christian Sirait
 */
public class crud extends koneksi {

    public crud(db db) {
        this.db = db;
    }
    public void create(String nama, int massa,long harga){
    try{
            db.statement = db.koneksi.createStatement(); 
            String query = "INSERT INTO 'barang' ('nama', 'massa', 'harga') VALUES ('"+ nama +"', '"+ massa +"', '"+harga+"')";
            db.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }
        
    public Object[][] readData(){
        Object[][] barang = new Object[50][4];
        try{
            db.statement = db.koneksi.createStatement();
            ResultSet result = db.statement.executeQuery("SELECT * FROM 'barang'");
            
            int jumlahBarang = 0;
            while(result.next()){
                
                barang[jumlahBarang][0] = result.getString("id");
                barang[jumlahBarang][1] = result.getString("nama");
                barang[jumlahBarang][2] = result.getString("massa");
                barang[jumlahBarang][3] = result.getString("harga");
                jumlahBarang++;
            }
            db.statement.close();
        } catch(Exception err){
            System.out.println(err);
        }
        return barang;
  
    }

    public void update(String nama, int massa,long harga){
    try{
            db.statement = db.koneksi.createStatement(); 
            String query = "UPDATE 'barang' SET 'nama' = '"+nama+"', 'massa'='"+massa+"','harga'='"+harga+"' WHERE 'barang'.'nama' ='"+nama+"'";
            db.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }
     public void delete(String nama){
        try{
            db.statement = db.koneksi.createStatement(); 
            String query = "DELETE FROM 'batang' WHERE 'barang'.'nama' = '"+nama+"'";
            db.statement.execute(query);
        }catch(Exception err){
            System.out.println(err);
        }
    }
}
