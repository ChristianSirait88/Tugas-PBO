/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Christian Sirait
 */
public class tabel extends AbstractTableModel {
    List<barang> list_barang;

    public tabel(List<barang> list_barang) {
        this.list_barang = list_barang;
    }
    
    @Override
    public int getRowCount() {
        return list_barang.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Nama";
            case 1:
                return "Massa";
            case 2:
                return "Harga";
            case 3:
                return "id";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list_barang.get(rowIndex).getNama();
            case 1:
                return list_barang.get(rowIndex).getMassa();
            case 2:
                return list_barang.get(rowIndex).getHarga();
            case 3:
                return list_barang.get(rowIndex).getId();
            default :    
            return null;
        }
    }
}
  

