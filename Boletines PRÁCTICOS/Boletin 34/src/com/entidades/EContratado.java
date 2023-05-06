package com.entidades;


import java.util.GregorianCalendar;


public class EContratado extends Empregado {

    private float soldoBasico;

    public EContratado() {
    }

    public EContratado(String dni, String nome, String apelidos, String dataIngreso, float soldoBasico) {
        super(dni, nome, apelidos, dataIngreso);
        this.soldoBasico = soldoBasico;
    }

    

    public float getSoldoBasico() {
        return soldoBasico;
    }

    public void setSoldoBasico(float soldoBasico) {
        this.soldoBasico = soldoBasico;
    }

  

    public float complementoSalarial() {
        String dataIngreso = super.getDataIngreso();
        String[] fechaPartes = dataIngreso.split("/");
        int dia = Integer.parseInt(fechaPartes[0]);
        int mes = Integer.parseInt(fechaPartes[1]) - 1;
        int anho = Integer.parseInt(fechaPartes[2]);
        GregorianCalendar fecha1 = new GregorianCalendar(anho, mes, dia);
        GregorianCalendar fecha2 = new GregorianCalendar();
        long diferenciaEnMilisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        double diferenciaAnhos = Math.floor(diferenciaEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        if (diferenciaAnhos >= 0 || diferenciaAnhos <= 3) {
            soldoBasico = (float) ((soldoBasico * 0.05) + soldoBasico);
        } else if (diferenciaAnhos >= 4 || diferenciaAnhos <= 7) {
            soldoBasico = (float) ((soldoBasico * 0.10) + soldoBasico);
        } else if (diferenciaAnhos >= 8 || diferenciaAnhos <= 15) {
            soldoBasico = (float) ((soldoBasico * 0.15) + soldoBasico);
        } else if (diferenciaAnhos > 15) {
            soldoBasico = (float) ((soldoBasico * 0.20) + soldoBasico);
        }
        return soldoBasico;
    }

               
    
    @Override
    public String toString() {
        return super.toString()+ ", soldoBasico=" + soldoBasico;
    }
    
    
    
    
    
    
    
    
    

}
