/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file,arDatos. choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler.de.carros;

/**
 *
 * @author julian arias
 */
public class ALQUILERDECARROS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Vehiculo carro;
        Vehiculo carro1 = new Vehiculo ("mercedez benz","kj","renault ",15900);
       
       carro1.darDatos();
        carro = new Deportivo (180,"mustang","aqm47","ford",2345);   
        carro.darDatos();// TODO code application logic here
    }
    
}
