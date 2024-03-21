/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package api.vehiculo;



import api.vehiculo.domain.services.PruebaMoto;
import api.vehiculo.domain.services.PruebaCarro;



import api.vehiculo.model.Carro;
import api.vehiculo.model.Motos;

import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner= new Scanner(System.in);
            String placaMoto;
            String Marcamoto;
            String Modelomoto;
            String Velocidadmoto;
            
     
         // Moto
        System.out.println("---Ingrese informacion de los vehiculos---");
        
        System.out.print("Ingrese Cilindraje de la moto: ");
        placaMoto=scanner.next();
        System.out.println("Ingrese marca de la moto:");
        Marcamoto=scanner.next();
        System.out.println("Ingrese Modelo  de la moto:");
        Modelomoto=scanner.next();
        System.out.println("Ingrese Velocidad  de la moto:");
        Velocidadmoto=scanner.next();
        
        
        
        Motos motos=new Motos(0, placaMoto, Marcamoto, Modelomoto, placaMoto, 0);
                       
        PruebaMoto pruebaMoto=new PruebaMoto(motos);
        
        pruebaMoto.acelerar();
        System.out.println(motos.getVelocidadmaxima());

        pruebaMoto.direccion();
        pruebaMoto.frenar();
        pruebaMoto.tipotracion();
        
    
        //carro 
        
        String Tipotracioncarro;
        String marcacarro;
        String modelocarro;
        String placacarro;
        String velocidaddmaxcarro;
        
        
        System.out.println("---Ingrese informacion de los Carros---");
        
        System.out.print("Ingrese Cilindraje de la carro: ");
        placacarro=scanner.next();
        System.out.println("Ingrese marca de la carro:");
        marcacarro=scanner.next();
        System.out.println("Ingrese Modelo  de la carro:");
        modelocarro=scanner.next();
        System.out.println("Ingrese Velocidad  de la carro:");
        velocidaddmaxcarro=scanner.next();
         System.out.println("Ingrese Tipodelcarro: ");
        Tipotracioncarro=scanner.next();
        
          
        
        Carro carro =new Carro(Tipotracioncarro, marcacarro, modelocarro, placacarro,0);
        
        
         
        PruebaCarro pruebacarro = new PruebaCarro(carro);
      
        carro.getTipotracion();
        pruebacarro.acelerar();
        pruebacarro.direccion();
        pruebacarro.estacionamiento();
        pruebacarro.frenar();
         pruebacarro.tipotracion();  
        
        System.out.println(carro.getTipotracion());
        
        // Vehiculo
        
        
        
        
        
        
        
         
      }           
    } 
    

