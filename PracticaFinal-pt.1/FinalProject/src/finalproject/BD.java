package finalproject;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class BD {
    public void basedatos() throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        String username = "aula";
        String pass = "aula";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(url, username, pass);
        Statement st = con.createStatement();
        
        System.out.println("Introduce el nombre y contraseña");
        String n=sc.nextLine();
        String c=sc.nextLine();
        
        String consulta = insertarUsuarios(n, c);
         
        System.out.println("Conexion establecida");
        ResultSet rs = st.executeQuery(consulta);
        
        
        con.close();
    }
    
    public String insertarUsuarios(String nombre, String contrasenia){
        String s ="";
        s = "insert into usuarios values ('"+ nombre +"', "+ contrasenia +", )";
        return s;
    }
}
