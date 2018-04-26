package com.mycompany.fapi.poo_montadoras.fabricas.fabricaHonda;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import com.mycompany.fapi.poo_montadoras.carros.honda.City;
import com.mycompany.fapi.poo_montadoras.carros.honda.Fit;
import com.mycompany.fapi.poo_montadoras.fabricas.FabricaDeCarro;

public class FabricaHonda extends FabricaDeCarro{

    @Override
    public void constroiCarro() {
        Carro[] carros = {new City(), new Fit()};
        for (Carro carro : carros){}
    }
    
}
