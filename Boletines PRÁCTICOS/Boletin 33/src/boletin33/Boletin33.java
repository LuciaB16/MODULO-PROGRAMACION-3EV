/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin33;

import java.util.ArrayList;

public class Boletin33 {

    public static void main(String[] args) {
        
        ArrayList <SeleccionFutbol> lista = new ArrayList<>(); 
        
        SeleccionFutbol futbolista = new Futbolista(1,"delantero",01,"Iago","Aspas",32);
        SeleccionFutbol entrenador = new Entrenador(002,02,"Luis","Gomez",36);
        SeleccionFutbol masajista = new Masajista("Masajista",15,03,"Juan","Perez",25);
        SeleccionFutbol seleccionador = new Seleccionador(04,"Carlos","Martinez",38);
        lista.add(futbolista);
        lista.add(entrenador);
        lista.add(masajista);
        lista.add(seleccionador);
        System.out.println(lista);
    }
    
}
