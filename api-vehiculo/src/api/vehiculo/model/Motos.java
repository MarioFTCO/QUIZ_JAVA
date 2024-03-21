package api.vehiculo.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel BC 2
 */
public class Motos extends Vehiculos {
    private int velocidadmaxima;
    private String cilindraje;

    public Motos() {
    }

    public Motos(int velocidadmaxima, String cilindraje) {
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
    }

    public Motos(int velocidadmaxima, String cilindraje, String marca, String modelo, String placa, int velocidadmax) {
        super(marca, modelo, placa, velocidadmax);
        this.velocidadmaxima = velocidadmaxima;
        this.cilindraje = cilindraje;
    }

  

  

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    
    
}