/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author Daniel BC 2
 */

// Clase modelo para autos y motos
public class Vehiculos {
    private String marca;
    private String modelo;
    private String placa;
    

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String placa, int velocidadmax) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;

    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


  
}
