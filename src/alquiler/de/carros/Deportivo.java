/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler.de.carros;

/**
 *
 * @author julian arias
 */
public class  Deportivo extends Vehiculo  {
    /**
     * atributo que guarda el cilindraje del carro
     */
    int cilindraje;

    public Deportivo(int cilindraje, String marca, String matricula, String modelo, double tarifa) {
        super(marca, matricula, modelo, tarifa);
        this.cilindraje = cilindraje;
    }
    
    @Override
    public void darDatos(){
        super.darDatos();
        System.out.println(" el cilindraje del carro es: "+ cilindraje);
                   
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    


    
         
    
}
