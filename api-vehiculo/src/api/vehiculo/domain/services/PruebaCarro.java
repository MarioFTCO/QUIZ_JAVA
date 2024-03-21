/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.vehiculo.domain.services;

import api.vehiculo.model.Carro;

/**
 *
 * @author Daniel BC 2
 */
public class PruebaCarro implements Pruebasdruta{
    private Carro  carro ;

    public PruebaCarro(Carro carro) {
        this.carro = carro;
    }
    
    

    @Override
    public void acelerar() {
    System.out.println("El vehiculo de "+  carro.getMarca()+ " acelero"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void frenar() {
    System.out.println("El vehiculo de "+ carro.getMarca()+ " acelero"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void direccion() {
    System.out.println("El vehiculo de "+ carro.getMarca()+ " acelero"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void estacionamiento() {
    System.out.println("El vehiculo de "+ carro.getMarca()+ " acelero"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void tipotracion() {
      System.out.println("El Vehiculo de "+ carro.getMarca()+ "se de tracion ");

    }
    
}
