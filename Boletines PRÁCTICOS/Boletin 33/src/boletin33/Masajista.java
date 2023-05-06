/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, Integer aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrarse el masajista");
    }

    @Override
    public void viajar() {
         System.out.println("El masajista viaja"); 
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega un partido");
    }
    
    public void darMasaje(){
        System.out.println("El masajista da un masaje");
    }

    @Override
    public String toString() {
        return "\n\nMASAJISTA: \n" + super.toString()+ "titulacion=" + titulacion + ",\naniosExperiencia=" + aniosExperiencia +"\n";
    }
    
    
}
