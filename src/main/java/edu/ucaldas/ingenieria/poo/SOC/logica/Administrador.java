package edu.ucaldas.ingenieria.poo.SOC.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//nuevo codigo
@Entity
public class Administrador extends Persona {
    //nuevo codigo
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private String IdAdministrador;

    public String getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(String IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public Administrador() {
    }

    public Administrador(String nombre, String cedula, String correo, String area, String contraseña) {
        super(nombre, cedula, correo, area, contraseña);
    }

    
    
}
