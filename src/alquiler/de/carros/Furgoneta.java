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
public class Furgoneta extends Vehiculo{
    /**
     * atributo que guarda la capacidad de carga  en kilos del  carro
     */
    float peso;
    /**
     * atributo que guarda la capacidad de volumen en cemtimetros del carro
     */
    float volumen;

    public Furgoneta(float peso, float volumen, String marca, String matricula, String modelo, double tarifa) {
        super(marca, matricula, modelo, tarifa);
        this.peso = peso;
        this.volumen = volumen;
    }
    @Override
    public void darDatos(){
        super.darDatos();
        System.out.println("el peso de carga del vehiculo es: "+peso);
        System.out.println("el volumen de carga del  carro es: "+volumen);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

   
    
}
