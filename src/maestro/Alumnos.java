

package maestro;


public class Alumnos {
    String Id, nombre, sexo;
    int fecha_nacimiento, grado;
    

    Alumnos(){
    }
    
    public Alumnos(String Id, String nombre, String sexo, int fecha_nacimiento, int grado) {
        this.Id = Id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grado = grado;
    }  
}
