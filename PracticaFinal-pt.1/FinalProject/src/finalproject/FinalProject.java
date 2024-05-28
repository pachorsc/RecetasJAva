
package finalproject;

import Menus.*;
import java.sql.SQLException;


public class FinalProject {
    static Usuario usu;
    static Receta rece;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Sesion.setNomUsu("null");
        
        Eleccion menu_prin = new Eleccion();
        menu_prin.setVisible(true);
        menu_prin.setLocationRelativeTo(null);
        
    }

    static public Receta getRece() {
        return rece;
    }

     static public void setRece(Receta a) {
        FinalProject.rece = a;
    }
    
}
