/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

public class Entrenador extends SeleccionFutbol{

    private Integer idFederacion;

    public Entrenador() {
    }

    public Entrenador(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override
    public void viajar() {
       System.out.println("El entrenador viaja"); 
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega un partido");
    }
    
    
    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica un entrenamiento ");
    }

    @Override
    public String toString() {
        return "\n\nENTRENADOR: \n" + super.toString()+ "idFederacion=" + idFederacion +"\n";
    }
    
    
}
