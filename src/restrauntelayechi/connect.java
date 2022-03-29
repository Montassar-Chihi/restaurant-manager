/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restrauntelayechi;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
public class connect {
    Connection conn;
public static Connection connect(){
try {
Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/pos","pos","pos");
        return conn;

}catch (Exception err){
JOptionPane.showMessageDialog(null,err);
return null;
}
}
}
