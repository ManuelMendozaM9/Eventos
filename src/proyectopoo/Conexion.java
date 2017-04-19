/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import java.sql.*;

/**
 *
 * @author LC
 */

public class Conexion {
    private Connection conexion; // Establecer conexion a MySQL
    private Statement instruccionSQL; // Esta es la instruccion SQL a MySQL
    
    public Conexion() throws ClassNotFoundException, SQLException {
        // localizacion de la clase en el archivo.jar
        Class.forName("com.mysql.jdbc.Driver");
        
        // localhost = 127.0.0.1
        conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/eventos", 
                    "root", 
                    ""
        );
    }
    
    // Metodo para enviar instrucciones SQL a MySQL
    public ResultSet ejecutarSQL(String sql) throws SQLException {
        instruccionSQL = conexion.createStatement();
        ResultSet rs = instruccionSQL.executeQuery(sql);
        return rs;
    }
    public void ejecutarTransaccion(String sql)throws SQLException {
        instruccionSQL = conexion.createStatement();
        instruccionSQL.executeUpdate(sql);
       
    }
    public ResultSet consultar(String sql) throws SQLException{
        instruccionSQL = conexion.createStatement();
        return instruccionSQL.executeQuery(sql);
    }

    PreparedStatement prepareStatement(String select_idusuario_password_from_usuario_wh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ejecutarSQL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}