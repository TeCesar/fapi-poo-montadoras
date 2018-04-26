package com.mycompany.fapi.poo_montadoras.fabricas.fabricaFord;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import com.mycompany.fapi.poo_montadoras.carros.ford.Fiesta;
import com.mycompany.fapi.poo_montadoras.carros.ford.Focus;
import com.mycompany.fapi.poo_montadoras.carros.ford.Fusion;
import com.mycompany.fapi.poo_montadoras.fabricas.FabricaDeCarro;

public class FabricaFord extends FabricaDeCarro{

    @Override
    public void constroiCarro() {
        Carro[] carros = {new Fiesta(), new Focus(), new Fusion()};
        for (Carro carro : carros){}
    }
    
}
