package com.mycompany.fapi.poo_montadoras.main;

import com.mycompany.fapi.poo_montadoras.fabricas.FabricaDeCarro;
import com.mycompany.fapi.poo_montadoras.fabricas.fabricaChevrolet.FabricaChevrolet;
import com.mycompany.fapi.poo_montadoras.fabricas.fabricaFord.FabricaFord;
import com.mycompany.fapi.poo_montadoras.fabricas.fabricaHonda.FabricaHonda;
import com.mycompany.fapi.poo_montadoras.fabricas.fabricaToyota.FabricaToyota;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarro[] fabricaDeCarros = {new FabricaChevrolet(), new FabricaFord(), new FabricaHonda(), new FabricaToyota()};
        
        for (int cont = 0; cont < 10; cont++){
            for (FabricaDeCarro fabricaDeCarro : fabricaDeCarros){
                fabricaDeCarro.constroiCarro();
            }
        }
    }
}
