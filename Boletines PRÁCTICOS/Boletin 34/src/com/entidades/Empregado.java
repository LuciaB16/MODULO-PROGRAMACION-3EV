
package com.entidades;

public class Empregado {
    
    private String dni;
    private String nome;
    private String apelidos;
    private String dataIngreso;

    public Empregado() {
    }

    public Empregado(String dni, String nome, String apelidos, String dataIngreso) {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;
        this.dataIngreso = dataIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }

    @Override
    public String toString() {
        return "dni=" + dni + ", nome=" + nome + ", apelidos=" + apelidos + ", dataIngreso=" + dataIngreso;
    }
    
    
}