/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

public class Seleccionador extends SeleccionFutbol{

    public Seleccionador() {
    }

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse el seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viaja"); 
    }

    @Override
    public void entrenar() {
         System.out.println("El seleccionador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega un partido");
    }
    
    
    public void seleccionarXogador(){
        System.out.println("El seleccionador selecciona un jugador");
    }

    @Override
    public String toString() {
        return "\n\nSELECCIONADOR: \n" + super.toString() +"\n";
    }
    
    
}
