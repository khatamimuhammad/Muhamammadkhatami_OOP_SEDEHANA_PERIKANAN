/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perikanan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 *
 * @author j
 */
public class Perikanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koi ikan = new Koi();
        
        //Frame Utama Start
        JFrame main = new JFrame("Perikanan");
        main.setSize(500,250);
        main.setLayout(null);
        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
        JLabel title = new JLabel("Perikanan");
        title.setBounds(210,30,150,30);
        main.add(title);
        
        JButton bermain = new JButton ("START");
        bermain.setBounds(50, 90, 130, 80);
        main.add(bermain);
        
        JButton keluar = new JButton("EXIT");
        keluar.setBounds(300, 90, 130, 80);
        main.add(keluar);
        //Frame Utama End
        
        //Frame Permainan Start
        JFrame permainan = new JFrame("Perikanan");
        permainan.setSize(500,800);
        permainan.setLayout(null);
        permainan.setLocationRelativeTo(null);
        
        JLabel judul = new JLabel ("Ikan Koi");
        judul.setBounds(220,20,150,25);
        permainan.add(judul);
        
        JLabel icon = new JLabel("");
        icon.setIcon(new ImageIcon("gambar\\ikankoi.jpg"));
        icon.setBounds(90, 45, 300, 150);
        permainan.add(icon);
        
        JLabel hari = new JLabel ("");
        hari.setBounds(220, 200, 150, 25);
        permainan.add(hari);
        
        JLabel nama = new JLabel("Nama Ikan: ");
        nama.setBounds(75, 250, 150, 25);
        permainan.add(nama);
        
        JLabel nama2 = new JLabel("Koi");
        nama2.setBounds(300, 250, 100,25);
        permainan.add(nama2);
        
        JLabel status = new JLabel("Warna Ikan: ");
        status.setBounds(75, 300, 150, 25);
        permainan.add(status);
        
        JLabel status2 = new JLabel("Cerah");
        status2.setBounds(300,300,100,25);
        permainan.add(status2);
        
        JLabel kondisi = new JLabel("Kondisi Kolam: ");
        kondisi.setBounds(75, 350, 150, 25);
        permainan.add(kondisi);
        
        JLabel kondisi2 = new JLabel("");
        kondisi2.setBounds(300,350,100,25);
        permainan.add(kondisi2);
        
        JLabel makan = new JLabel("Status Ikan: ");
        makan.setBounds(75, 400, 150, 25);
        permainan.add(makan);
        
        JLabel makan2 = new JLabel("");
        makan2.setBounds(300,400,100,25);
        permainan.add(makan2);
        
        JButton kasih = new JButton("Beri Makan");
        kasih.setBounds(50, 500, 130, 80);
        permainan.add(kasih);
        
        JButton sudah = new JButton("Selesai Hari ini");
        sudah.setBounds(300, 500, 130, 80);
        permainan.add(sudah);
        
        JButton bersih = new JButton("Bersihkan Kolam");
        bersih.setBounds(50, 600, 130, 80);
        permainan.add(bersih);
        
        JButton exit = new JButton("EXIT");
        exit.setBounds(300,600,130,80);
        permainan.add(exit);
        //Frame Permainan End
        
        //Logic Button
        bermain.addActionListener((ActionEvent e) -> {
            hari.setText("Hari ke-" + ikan.hari);
            kondisi2.setText(ikan.kondisi);
            makan2.setText(ikan.lapar);
            main.setVisible(false);
            permainan.setVisible(true);
        });
        
        exit.addActionListener((ActionEvent e) -> {
            permainan.setVisible(false);
            main.setVisible(true);
        });
        
        kasih.addActionListener((ActionEvent e) ->{
           ikan.makan();
           makan2.setText(ikan.lapar);
        });
        
        sudah.addActionListener((ActionEvent e) ->{
           ikan.selesai();
           hari.setText("Hari ke-" + ikan.hari);
           kondisi2.setText(ikan.kondisi);
           makan2.setText(ikan.lapar);
        });
        
        bersih.addActionListener((ActionEvent e) ->{
           ikan.bersih();
           kondisi2.setText(ikan.kondisi);
        });
        
        keluar.addActionListener((ActionEvent e) ->{
            System.exit(0);
        });
        //Logic Button 
        
    }
}
