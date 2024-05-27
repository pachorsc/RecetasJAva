package Menus;

import finalproject.BD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sesion {
    private static String cod;
    private static String nomUsu = "No registrado";
    
    public static void setNomUsu(String nom){
        nomUsu = nom;
    } 
    
    public static String getNom(){
        return nomUsu;
    }
    
    public static void setCod(String c){
        cod = c;
    } 
    
    public static String getCod(){
        return cod;
    }
    
    public static String getNom(String cod) throws SQLException, ClassNotFoundException{
        ResultSet rs=BD.datos(BD.select_usu()+ BD.select_condicion("cod", cod));
        nomUsu=rs.getString(1);
        return nomUsu;
    }
    
    public static String getCod(String nombre) throws ClassNotFoundException, SQLException{
        ResultSet rs= BD.datos(BD.select_usu()+ BD.select_condicion("nombre", nombre));
        rs.next();
        cod=rs.getString(1);
        return cod;
    }
}
