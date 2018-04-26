package com.mycompany.fapi.poo_montadoras.carros.chevrolet;

import com.mycompany.fapi.poo_montadoras.carros.Carro;

public class Camaro extends Carro{
    public Camaro(){
        this.setMarca("Chevrolet");
        this.setModelo("Camaro");
        this.setCor("Amarelo");
        this.setMotor("2.5 Turbo");
        this.mostrarCarro();
    }
}
