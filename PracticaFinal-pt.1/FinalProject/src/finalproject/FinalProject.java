
package finalproject;

import Menus.*;
import java.sql.SQLException;


public class FinalProject {
    static String usuario_Ini= "";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Eleccion menu_prin = new Eleccion();
        menu_prin.setVisible(true);
        menu_prin.setLocationRelativeTo(null);
        
    }

    public static String getUsuario_Ini() {
        return usuario_Ini;
    }

    public static void setUsuario_Ini(String usuario_Ini) {
        FinalProject.usuario_Ini = usuario_Ini;
    }
    
    
}
