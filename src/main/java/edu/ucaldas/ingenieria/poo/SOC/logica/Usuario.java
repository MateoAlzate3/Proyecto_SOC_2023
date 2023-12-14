package edu.ucaldas.ingenieria.poo.SOC.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//nuevo codigo
@Entity
public class Usuario extends Persona {
    //nuevo codigo
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private String IdUsuario;

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Usuario(){
        
    }

    public Usuario(String nombre, String cedula, String correo, String area, String contraseña) {
        super(nombre, cedula, correo, area, contraseña);
    }
         
        
}
