/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

public class Futbolista extends SeleccionFutbol{

    private Integer dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse o futbolista");
        
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja"); 
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }
    
    public void entrevista(){
        System.out.println("El futbolista es entrevistado");
    }

    @Override
    public String toString() {
        return "\nFUTBOLISTA: \n" + super.toString()+ "dorsal=" + dorsal + ",\ndemarcacion=" + demarcacion +"\n";
    }
    
    
}
