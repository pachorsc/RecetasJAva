
package finalproject;


public class Receta {
    private int cod;
    private String nombre;
    private String autor;
    private String ingredientes;
    private String pasos;
    
    public Receta(){
        nombre = "";
        autor = "";
        ingredientes = "";
        pasos = "";
    }
    
    public Receta(String nom, String aut, String pas){
        this.nombre = nom;
        this.autor = aut;
        this.pasos = pas;
    }

    public Receta(int cod, String nombre, String autor, String ingredientes, String pasos) {
        this.cod = cod;
        this.nombre = nombre;
        this.autor = autor;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
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

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
      
}
