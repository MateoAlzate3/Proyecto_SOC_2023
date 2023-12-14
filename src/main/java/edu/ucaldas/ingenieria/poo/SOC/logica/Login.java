package edu.ucaldas.ingenieria.poo.SOC.logica;

public class Login {
    
    private String cedula;
    private String password;

    public Login(String cedula, String password) {
        this.cedula = cedula;
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login() {
    }  
    
}
