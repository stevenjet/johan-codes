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
public class Turismo extends Vehiculo {
    int puertas;
    String  cambio;

    public Turismo(int puertas, String cambio, String marca, String matricula, String modelo, double tarifa) {
        super(marca, matricula, modelo, tarifa);
        this.puertas = puertas;
        this.cambio = cambio;
    }
    @Override
    public void darDatos(){
        super.darDatos();
        System.out.println("el numero de puertas del carro es: "+puertas);
        System.out.println("el tipo de cambio es: "+cambio);
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    
}
