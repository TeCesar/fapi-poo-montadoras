package com.mycompany.fapi.poo_montadoras.fabricas.fabricaToyota;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import com.mycompany.fapi.poo_montadoras.carros.toyota.Corolla;
import com.mycompany.fapi.poo_montadoras.carros.toyota.Etios;
import com.mycompany.fapi.poo_montadoras.carros.toyota.Prius;
import com.mycompany.fapi.poo_montadoras.fabricas.FabricaDeCarro;

public class FabricaToyota extends FabricaDeCarro{

    @Override
    public void constroiCarro() {
        Carro[] carros = {new Corolla(), new Etios(), new Prius()};
        for (Carro carro : carros){}
    }
    
}
