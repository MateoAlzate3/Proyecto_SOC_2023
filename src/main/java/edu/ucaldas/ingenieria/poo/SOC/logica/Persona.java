package edu.ucaldas.ingenieria.poo.SOC.logica;

import javax.persistence.Entity;
//nuevo codigo 
@Entity
public class Persona {
    
   private String nombre;
   private String cedula;
   private String correo ; 
   private String area;
   private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

    public Persona() {
    }

    public Persona(String nombre, String cedula, String correo, String area, String contraseña) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.area = area;
        this.contraseña = contraseña;
    }

    
    
}
