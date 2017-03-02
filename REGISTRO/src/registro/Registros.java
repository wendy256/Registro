package registro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alvarez
 */
public class Registros {
    
    String Nombre;
    String Apellido_Paterno;
    String Apellido_Materno;
    String Edad;
    
    public Registros (String Nombre,String Apellido_Paterno,String Apellido_Materno,String Edad){
        this.Nombre=Nombre;
        this.Apellido_Paterno=Apellido_Paterno;
        this.Apellido_Materno=Apellido_Materno;
        this.Edad=Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

  
}
    

