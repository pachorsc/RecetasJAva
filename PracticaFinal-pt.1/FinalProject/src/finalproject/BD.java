
package finalproject;

import java.sql.*;


public class BD {
    //ejecutar queris
    static public void basedatos(String n) throws ClassNotFoundException, SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "aula";
        String pass = "aula";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, pass);
        Statement st = con.createStatement();

        String consulta  = n;
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        
        con.close();
    }

    
    
    //booleano si coincide 
    static public boolean coincide(String n) throws ClassNotFoundException, SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "aula";
        String pass = "aula";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, pass);
        Statement st = con.createStatement();

        String consulta  = n;
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        boolean existe = false;
        
        if (rs.next()) {
            existe = true;
        }
        
        con.close();
        
        return existe;
    }
    
    
    static public String insertar_usu(String usu ,String cont){
      String consu = "insert into usuarios values ('"+ usu +"', '"+ cont +"', 0)";
      return consu;
    }
    static public String count_usu(String usu){
        String consu = "select nombre from usuarios where nombre = '"+usu+"'";
        return consu;
    }
    static public String count_cont(String cont){
        String consu = "select nombre from usuarios where contraseña = '"+cont+"'";
        return consu;
    } 
    static public String select_receta(){
        String consu = "select * from recetas";
        return consu;
    }
    static public String select_receta_nombre(String receta){
        String consu = "select * from recetas where nombre = '"+receta+"'";
        return consu;
    }
    static public String select_receta_usu(String receta){
        String consu = "select * from recetas where autor = '"+receta+"'";
        return consu;
    }
    static public String select_receta_etiqueta(String receta){
        String consu = "select * from recetas where cod in (select receta from receta_etiqueta where etiqueta = (select cod from etiquetas where nombre='"+receta+"'))";
        return consu;
    }
}

