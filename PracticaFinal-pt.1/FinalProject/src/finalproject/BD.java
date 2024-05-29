
package finalproject;

import java.sql.*;


public class BD {
    //Conectar base de datos
    private static Connection con = null;
    
    static public void Conectar() throws ClassNotFoundException, SQLException{
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "aula";
        String pass = "aula";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(url, username, pass);
    }
    
    //Ejecutar Querys
    static public void basedatos(String n) throws ClassNotFoundException, SQLException {
        Conectar();
        Statement st = con.createStatement();

        String consulta  = n;
         
        //System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        con.close();
    }
    
    //Booleano si coincide
    static public boolean coincide(String n) throws ClassNotFoundException, SQLException {
        Conectar();
        Statement st = con.createStatement();

        String consulta  = n;
         
        //System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        boolean existe = false;
        
        if (rs.next()) {
            existe = true;
        }
        
        return existe;
    }
    
    //Devuelve un cursor con un select
    static public ResultSet datos(String n) throws ClassNotFoundException, SQLException {
        Conectar();
        Statement st = con.createStatement();

        String consulta  = n;
         
        //System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        return rs;
    }
    //INSERT
    static public String insertar_usu(String usu ,String cont){
      String consu = "insert into usuarios (nombre, contraseña) values ('"+ usu +"', '"+ cont +"')";
      return consu;
    }
    static public String insertar_rece(String nombre, String pasos, String autor){
        String consu = "insert into RECETAS (nombre, pasos, autor) values ('"+ nombre +"', '"+ pasos +"','"+autor+"')";
        return consu;
    }
    static public String insertar(String tabla ,String values){
      String consu = "insert into "+tabla+"  values ("+values+")";
      return consu;
    }
    //SELECT
    static public String select(String select, String tabla){
        String consu = "select "+select+" from "+tabla;
        return consu;
    }
    static public String select_usu(){
        String consu = "select * from usuarios";
        return consu;
    }   
    static public String select_receta(){
        String consu = "select * from recetas";
        return consu;
    }
    static public String select_condicion(String condicion, String valor){
        String consu =" where "+condicion+" = '"+valor+"'";
        return consu;
    }
    static public String select_condicion_and(String condicion, String valor){
        String consu = "";
        consu+=" and "+condicion+" = '"+valor+"'";
        return consu;
    }
    
    //UPDATE
    static public String update(String tabla, String condicion, String nuevoNombre, String antiguoNombre){
        String consu = "update "+tabla+" set "+condicion+" = '"+nuevoNombre+"' where "+condicion+" ='"+antiguoNombre+"'";
        return consu;
    }
    
}

