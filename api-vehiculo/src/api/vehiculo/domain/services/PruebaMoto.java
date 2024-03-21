/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.domain.services;


import api.vehiculo.model.Vehiculos;


/**
 *
 * @author Daniel BC 2
 */
public class PruebaMoto implements Pruebasdruta{
    private Vehiculos vehiculos;

    public PruebaMoto(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public void acelerar() {
        System.out.println("El vehiculo de "+ vehiculos.getMarca()+ " acelero");
   
    }

    @Override
    public void frenar() {
        System.out.println("El Vehiculo de " + vehiculos.getMarca()+" Freno");        
    }
    @Override
    public void direccion() {
        System.out.println("El Vehiculo  de " + vehiculos.getMarca()+" Con tipo de Dirrecion");
    
    }  
    

    @Override
    public void estacionamiento() {
        System.out.println("El Vehiculo de "+ vehiculos.getMarca()+ "se aparca");
        
    
        
    }

    @Override
    public void tipotracion() {
      System.out.println("El Vehiculo de "+ vehiculos.getMarca()+ "se de tracion ");
  
    }
    
    
    
    
    
    
    
    
    
    
   
    
   
}


