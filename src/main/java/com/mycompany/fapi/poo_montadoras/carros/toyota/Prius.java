package com.mycompany.fapi.poo_montadoras.carros.toyota;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import java.util.Random;

public class Prius extends Carro{
    public Prius(){
        this.setMarca("Toyota");
        this.setModelo("Prius");
        
        Random rand = new Random();
        
        String cores[] = new String[5];
        cores[0] = "Preto";
        cores[1] = "Branco";
        cores[2] = "Prata";
        cores[3] = "Azul";
        cores[4] = "Verde";
        int defCor = rand.nextInt(5);
        this.setCor(cores[defCor]);
        
        String motores[] = new String[4];
        motores[0] = "1.4";
        motores[1] = "1.6";
        motores[2] = "2.0";
        motores[3] = "2.0 Turbo";
        int defMotor = rand.nextInt(4);
        this.setMotor(motores[defMotor]);
        this.mostrarCarro();
    }
}
