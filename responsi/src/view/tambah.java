/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Christian Sirait
 */
public class tambah extends JFrame implements ActionListener {
   JLabel label1 = new JLabel("Input Data");
   JLabel label2 = new JLabel("Nama ");
   JLabel label3 = new JLabel("Massa (gr) ");
   JLabel label4 = new JLabel("Harga Satuan ");
   JTextField formNama = new JTextField("");
   JTextField formMassa= new JTextField("");
   JTextField formharga =new JTextField("");
   JButton tombolSubmit = new JButton("Submit");
   JButton tombolReset = new JButton("Reset");
   JButton tombolKembali = new JButton("Kembali");
   
   public tambah(){
    setTitle("Tambah");
        setSize(550,350);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(400,400);
        setLayout(null);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(formNama);
        add(formMassa);
        add(formharga);
        add(tombolSubmit);
        add(tombolReset);
        add(tombolKembali);
        label1.setBounds(100, 100, 100, 30);
        label2.setBounds(100, 100, 100, 80);
        label3.setBounds(100, 100, 100, 130);
        label4.setBounds(100, 100, 100, 180);
        formNama.setBounds(200, 125, 150, 20);
        formMassa.setBounds(200, 150, 150, 20);
        formharga.setBounds(200, 175, 150, 20);
        tombolSubmit.setBounds(200, 225, 75, 30);
        tombolReset.setBounds(275, 225, 75, 30);
        tombolKembali.setBounds(350, 225, 75, 30);
        tombolKembali.addActionListener(this);
        
   }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tombolKembali){
             mainmenu main = new mainmenu();
             main.show();
             dispose();
         }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
