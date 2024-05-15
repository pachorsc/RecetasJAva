
package finalproject;


public class Receta {
    String nombre;
    String autor;
    String pasos;
    
    public Receta(){
        
    }
    public Receta(String nom, String aut, String pas){
        this.nombre = nom;
        this.autor = aut;
        this.pasos = pas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPasos() {
        return pasos;
    }

    public void setPasos(String pasos) {
        this.pasos = pasos;
    }
    
    
}
