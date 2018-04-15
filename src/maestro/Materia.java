

package maestro;


public class Materia {
    String Id, nombre;

    Materia(){
    }
    
    public Materia(String Id, String nombre ) {
        this.Id = Id;
        this.nombre = nombre;
    }
    public String getId(){
        return Id;
    }
    public void setId(){
        this.Id=Id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    
}
