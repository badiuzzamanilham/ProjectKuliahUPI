/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubesrevisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksiDB {
    public static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/tubesRevisi"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Gagal Koneksi");
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
    return mysqlconfig;
    }
    
//    public static void main(String[]args) throws SQLException{
//        Connection c = (Connection)koneksiDB.configDB();
//    }
    
}
