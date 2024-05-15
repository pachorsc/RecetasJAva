
package finalproject;

import Menus.*;
import java.sql.SQLException;


public class FinalProject {
    Usuario usu;
    Receta rece;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        
        Eleccion menu_prin = new Eleccion();
        menu_prin.setVisible(true);
        menu_prin.setLocationRelativeTo(null);
        
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Receta getRece() {
        return rece;
    }

    public void setRece(Receta rece) {
        this.rece = rece;
    }
    
}
