
package maestro;


public class Maestro {

    String Id, nombre,sexo;
    int fecha_nacimiento;
    

    Maestro(){
    }
    
    public Maestro(String Id, String nombre, String sexo, int fecha_nacimiento) {
        this.Id = Id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
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
    public String getSexo(){
        return sexo;
    }
    public void setSexo(){
        this.sexo=sexo;
    }
    public int getFecha_nacimiento(){
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(){
        this.fecha_nacimiento=fecha_nacimiento;
    }
    
    public static void main(String[] args) {
        
    }
    
}
