package finalproject;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class BD {
    
    static public void basedatos(String n) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
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
    static public String insert(String usu ,String cont){
      String consu = "insert into usuarios values ('"+ usu +"', '"+ cont +"', 0)";
      return consu;
    }
}
