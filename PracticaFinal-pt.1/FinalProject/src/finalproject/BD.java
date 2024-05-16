
package finalproject;

import java.sql.*;


public class BD {
    //Conectar base de datos
    static public Connection Conectar() throws ClassNotFoundException, SQLException{
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "aula";
        String pass = "aula";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, pass);
        return con;
    }
    
    //Ejecutar Querys
    static public void basedatos(String n) throws ClassNotFoundException, SQLException {
        Statement st = Conectar().createStatement();

        String consulta  = n;
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        Conectar().close();
    }
    
    //Booleano si coincide
    static public boolean coincide(String n) throws ClassNotFoundException, SQLException {
        Statement st = Conectar().createStatement();

        String consulta  = n;
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        boolean existe = false;
        
        if (rs.next()) {
            existe = true;
        }
        
        Conectar().close();
        
        return existe;
    }
    
    //Devuelve un cursor con un select
    static public ResultSet datos(String n) throws ClassNotFoundException, SQLException {
        Statement st = Conectar().createStatement();

        String consulta  = n;
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        Conectar().close();
        return rs;
    }
    
    static public String insertar_usu(String usu ,String cont){
      String consu = "insert into usuarios (nombre, contraseña) values ('"+ usu +"', '"+ cont +"')";
      return consu;
    }
    static public String select_usu(String usu){
        String consu = "select nombre from usuarios where nombre = '"+usu+"'";
        return consu;
    }
    static public String select_cont(String cont){
        String consu = "select nombre from usuarios where contraseña = '"+cont+"'";
        return consu;
    } 
    static public String select_receta(){
        String consu = "select * from recetas";
        return consu;
    }
    static public String select_receta__eleccion(){
        String consu = "select nombre, autor, pasos from recetas";
        return consu;
    }
    static public String select_receta(String condicion, String receta){
        String consu = "select * from recetas where "+condicion+" = '"+receta+"'";
        return consu;
    }
    
    static public String select_receta_etiqueta(String receta){
        String consu = "select * from recetas where cod in (select receta from receta_etiqueta where etiqueta = (select cod from etiquetas where nombre='"+receta+"'))";
        return consu;
    }
}

