
package com.datos;

import com.Lucia.datos.PedirDatos;
import com.entidades.EContratado;
import com.entidades.EDestajo;
import com.entidades.Empregado;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaEmpleados {
    
    Empregado contratado = new EContratado(PedirDatos.pedirString("Escribe dni"),PedirDatos.pedirString("Escribe nome"),PedirDatos.pedirString("Escribe apelidos"),PedirDatos.pedirString("Introduce data de ingreso"),PedirDatos.pedirFloat("Introduce salario"));
    Empregado destajo = new EDestajo(PedirDatos.pedirString("Escribe dni"),PedirDatos.pedirString("Escribe nome"),PedirDatos.pedirString("Escribe apelidos"),PedirDatos.pedirString("Introduce data de ingreso(/dd/mm/yyyy)"),PedirDatos.pedirInt("Introduce cantidad de clientes"),PedirDatos.pedirFloat("Introduce el complemento por clientes"));
   
    
    public ArrayList<Empregado> añadirEmpregado(ArrayList<Empregado>lista) {
        lista.add(contratado);
        lista.add(destajo);
        return lista;
    }
    
    public static void mostrar(ArrayList<Empregado>lista) {
        for (Empregado elemento : lista) {
            System.out.println(elemento);
        if(elemento instanceof EContratado){
            EContratado e=(EContratado)elemento;
            JOptionPane.showInputDialog(elemento.toString()+ "." + e.complementoSalarial());
        }

       }
    }
    

}
