
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;


public class ProductoDAO implements Producto {

    @Override
    public void inProducto(String descripcion, float precio, int existencia) {
       
    try {
            Connection conn = Conexión.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call inProducto(?,?,?)}");
            sentencia.setString("descripcion", descripcion);
            sentencia.setFloat("precio", precio);
            sentencia.setInt("existencia", existencia);
            
            
            sentencia.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar gastos en la base de datos " + ex.getLocalizedMessage());
        }

    }

    @Override
    public void elProducto(int codigo) {
    
     try {
            Connection conn = Conexión.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call elProducto(?,?,?)}");
            sentencia.setInt("codigo", codigo);
           
            sentencia.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar gastos en la base de datos " + ex.getLocalizedMessage());
        }   
        
        
    }

    @Override
    public void buProducto(int codigo) {
    
      try {
            Connection conn = Conexión.getInstance().getConexion();
            CallableStatement sentencia = conn.prepareCall("{call buProducto(?,?,?)}");
            sentencia.setInt("codigo", codigo);
           
            sentencia.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar gastos en la base de datos " + ex.getLocalizedMessage());
        }   
        
    }
  
}
