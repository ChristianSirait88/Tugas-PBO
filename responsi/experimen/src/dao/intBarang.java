/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import Model.barang;
import java.util.List;
/**
 *
 * @author Christian Sirait
 */
public interface intBarang {
    public void add(barang barang);
    public void update(barang barang);
    public void delete(int id);
    public List<barang> getBarang();
}
