
package com.presentacion;

import com.datos.ListaEmpleados;
import com.entidades.Empregado;
import java.util.ArrayList;



public class Boletin34 {

  
    public static void main(String[] args) {
          
        ArrayList <Empregado> lista=new ArrayList<>();
        ListaEmpleados empleados=new ListaEmpleados();
        empleados.añadirEmpregado(lista);
        empleados.mostrar(lista);


    }
}