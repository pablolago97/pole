/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Metodosdb {
         

    public static Connection conexion() {
     Connection co = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
              co = DriverManager.getConnection("jdbc:mysql://10.0.0.254/bergonpazos?user=bergonpazos&password=bergonpazos");
             return co;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No pudo conectarse");
            
            return co;
        }

    }
    public void input(String Nombre, String Tiempo, String Puntuacion) throws ClassNotFoundException{
      String SQL = "INSERT INTO game(Nombre, Tiempo, Puntuacion) VALUES(?, ?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection("jdbc:mysql://10.0.0.254/bergonpazos?user=bergonpazos&password=bergonpazos");
            PreparedStatement pst = Metodosdb.conexion().prepareStatement(SQL);
            pst.setString(1, Nombre);
            pst.setString(2,Tiempo);
            pst.setString(3,Puntuacion);           
            int n = pst.executeUpdate();
            if (n>0){
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo acceder");
        }
}
     public ResultSet consult(JLabel... etiqueta) throws ClassNotFoundException {
         
        ResultSet rs=null;
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection co = DriverManager.getConnection("jdbc:mysql://10.0.0.254/bergonpazos?user=bergonpazos&password=bergonpazos");
           Statement s = Metodosdb.conexion().createStatement();
           rs = s.executeQuery("select Nombre, Tiempo, Puntuacion from game order by Puntuacion desc limit 0,1 ;");
           while(rs.next()){
           etiqueta[0].setText(rs.getString(1));
           etiqueta[1].setText(rs.getString(2));
           etiqueta[2].setText(rs.getString(3));
           }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return rs;
    }
     
     public  void delete(String x) throws SQLException{
      
       
       String SQL = "DELETE from game where Nombre ="+ JOptionPane.showInputDialog("¿Qué 'Score' desea eliminar?\n"+" "+x)+";";
        
            PreparedStatement pst = Metodosdb.conexion().prepareStatement(SQL);
            pst.execute();
}
}
