package com.mycompany.fapi.poo_montadoras.fabricas.fabricaChevrolet;

import com.mycompany.fapi.poo_montadoras.carros.Carro;
import com.mycompany.fapi.poo_montadoras.carros.chevrolet.Camaro;
import com.mycompany.fapi.poo_montadoras.carros.chevrolet.Cruze;
import com.mycompany.fapi.poo_montadoras.carros.chevrolet.Onix;
import com.mycompany.fapi.poo_montadoras.carros.chevrolet.Prisma;
import com.mycompany.fapi.poo_montadoras.fabricas.FabricaDeCarro;

public class FabricaChevrolet extends FabricaDeCarro{
    
    @Override
    public void constroiCarro() {
        Carro[] carros = {new Camaro(), new Cruze(), new Onix(), new Prisma()};
        for (Carro carro : carros){}
    }
}
