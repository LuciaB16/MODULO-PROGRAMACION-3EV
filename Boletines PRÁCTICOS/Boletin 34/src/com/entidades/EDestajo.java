
package com.entidades;


public class EDestajo extends Empregado {
    
    private int numClientes;
    private float complemento;

    public EDestajo() {
    }

    public EDestajo(String dni, String nome, String apelidos, String dataIngreso, int numClientes, float complemento) {
        super(dni, nome, apelidos, dataIngreso);
        this.numClientes = numClientes;
        this.complemento = complemento;
    }
    
        

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public float getComplemento() {
        return complemento;
    }

    public void setComplemento(float complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString()+ ", numClientes=" + numClientes + ", complemento=" + complemento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
