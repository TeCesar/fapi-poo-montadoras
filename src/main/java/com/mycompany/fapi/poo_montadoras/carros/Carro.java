package com.mycompany.fapi.poo_montadoras.carros;

public class Carro {
    protected int numPortas;
    protected int numPneus;
    protected int numRodas;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected String motor;

    public int getNumPortas() {
        return numPortas;
    }

    public int getNumPneus() {
        return numPneus;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    protected void setMotor(String motor) {
        this.motor = motor;
    }
    
    protected void mostrarCarro(){
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getCor());
        System.out.println(this.getMotor());
        System.out.println("");
    }
}
