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
public class Vehiculo {
     /**
      * atributo que guarda la marca del carro 
      */
    String marca;
    /**
     * atributo que guarda la placa delo carro
     */
    String matricula;
    /**
     * atributo que guarda el modelo del carro
     */
    String modelo;
    /**
     * atributo que guarda el costo del alquiler del carro 
     */
    double tarifa;
     /**
      * atributo que guarda disponibilidqad de carro 
      */
    boolean disponible;

    public Vehiculo(String marca, String matricula, String modelo, double tarifa){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.disponible = true ;
    }
    public void darDatos(){
        System.out.println("marca del vehiculo: "+marca);
        System.out.println("matricula del vehiculo: "+matricula);
        System.out.println("modelo del carro es  :"+modelo);
        System.out.println("la tarifa del carro es: "+tarifa);
        System.out.println("el carro esta disponible: "+ disponible);

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
