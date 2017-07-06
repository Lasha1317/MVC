package modelo;


import java.sql.*;

public class Conexión {
 
Connection conn;

private static class SingletonHolder{
    public static final Conexión INSTANCE = new Conexión();
}

public static Conexión getInstance(){
    return SingletonHolder.INSTANCE;
}

public String conectar ()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://localhost/farmacia", "root", "");
return "Se ha conectado a la base de datos";
}
catch (Exception e)
{ 

return "Ocurrió un error al conectar con la base de datos";

}   

}

public Connection getConexion()
{
return conn;
}

}
