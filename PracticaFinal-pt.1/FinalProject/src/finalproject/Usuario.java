package finalproject;

public class Usuario {
    private String nombre;
    private int rol;
    
    public Usuario(){
        String nombre="";
        int rol=0;
    }
    
    public Usuario(String nom){
        String nombre=nom;
        int rol=0;
    }
    
     public Usuario(String nom, int n){
        String nombre=nom;
        int rol=1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}
