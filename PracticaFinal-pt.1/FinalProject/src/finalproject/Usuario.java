package finalproject;

public class Usuario {
    private String nombre;
    private String contrasenia;
    private int rol;
       
    public Usuario(){
        nombre="";
        contrasenia="";
        rol=0;
    };
    
    public Usuario(String nom, String con){
        nombre=nom;
        contrasenia=con;
        rol=0;
    }
    
     public Usuario(String nom, String con, int n){
        nombre=nom;
        contrasenia=con;
        rol=1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}
