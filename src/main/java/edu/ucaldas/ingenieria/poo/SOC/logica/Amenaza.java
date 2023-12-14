package edu.ucaldas.ingenieria.poo.SOC.logica;

public class Amenaza {
    
    private String IdAmenaza;
    private String nombreAmenza;
    private String descripcionAmenaza;
    private String numeroAtaquesDetectados;

    public Amenaza(String IdAmenaza, String nombreAmenza, String descripcionAmenaza, String numeroAtaquesDetectados) {
        this.IdAmenaza = IdAmenaza;
        this.nombreAmenza = nombreAmenza;
        this.descripcionAmenaza = descripcionAmenaza;
        this.numeroAtaquesDetectados = numeroAtaquesDetectados;
    }

    public String getIdAmenaza() {
        return IdAmenaza;
    }

    public void setIdAmenaza(String IdAmenaza) {
        this.IdAmenaza = IdAmenaza;
    }

    public String getNombreAmenza() {
        return nombreAmenza;
    }

    public void setNombreAmenza(String nombreAmenza) {
        this.nombreAmenza = nombreAmenza;
    }

    public String getDescripcionAmenaza() {
        return descripcionAmenaza;
    }

    public void setDescripcionAmenaza(String descripcionAmenaza) {
        this.descripcionAmenaza = descripcionAmenaza;
    }

    public String getNumeroAtaquesDetectados() {
        return numeroAtaquesDetectados;
    }

    public void setNumeroAtaquesDetectados(String numeroAtaquesDetectados) {
        this.numeroAtaquesDetectados = numeroAtaquesDetectados;
    }

    public Amenaza() {
    }
    
}
