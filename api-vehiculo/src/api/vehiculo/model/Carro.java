/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.model;

/**
 *
 * @author Daniel BC 2
 */
public class Carro extends Vehiculos{
     private String Tipotracion ;

    public Carro() {
    }

    public Carro(String Tipotracion) {
        this.Tipotracion = Tipotracion;
    }

    public Carro(String Tipotracion, String marca, String modelo, String placa, int velocidadmax) {
        super(marca, modelo, placa, velocidadmax);
        this.Tipotracion = Tipotracion;
    }

    public String getTipotracion() {
        return Tipotracion;
    }

    public void setTipotracion(String Tipotracion) {
        this.Tipotracion = Tipotracion;
    }
    
    
    
    
}
