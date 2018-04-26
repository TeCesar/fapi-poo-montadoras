package com.mycompany.fapi.poo_montadoras.carros.ford;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import java.util.Random;

public class Fusion extends Carro{
    public Fusion(){
        this.setMarca("Ford");
        this.setModelo("Fusion");
        
        Random rand = new Random();
        
        String cores[] = new String[3];
        cores[0] = "Preto";
        cores[1] = "Branco";
        cores[2] = "Azul";
        int defCor = rand.nextInt(3);
        this.setCor(cores[defCor]);
        
        String motores[] = new String[2];
        motores[0] = "2.0";
        motores[1] = "2.5 Turbo";
        int defMotor = rand.nextInt(2);
        this.setMotor(motores[defMotor]);
        this.mostrarCarro();
    }
}
