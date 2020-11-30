package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    private static Connection conexion ;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user="root";
     private static final String password="";
      private static final String url="jdbc:mysql://localhost:3306/salario";
    public Conectar() {
        conexion=null;
        try{
           Class.forName(driver);
           conexion= (Connection) DriverManager.getConnection(url,user,password);
           if(conexion!=null){
               System.out.println("Conexion Establecida...");
           }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al Conectar..."+e);
        }
    }
    public Connection getConnection(){
        return conexion;
    }
    public void desconectar(){
        conexion=null;
        if(conexion==null){
        System.out.println("Conexion Finalizada...");
        }
    }
}
