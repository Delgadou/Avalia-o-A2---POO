package com.company;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    public List<Carro> listaDeCarros = new ArrayList<Carro>();

    public void adicionarCarroALista(Carro carro){
        listaDeCarros.add(carro);
    }

    public List getArray(){
        return this.listaDeCarros;
    }

    public Carro obterCarro(int chassi){
        Carro carro = null;

        for(int i = 0; i < this.listaDeCarros.size(); i += 1){
            if(this.listaDeCarros.get(i).getChassi() == chassi){
                carro = this.listaDeCarros.get(i);
                i = this.listaDeCarros.size();
            }
        }
        return carro;
    }

    public List buscar(Carro carro){
        List<Carro> listaFiltradaDeCarros = new ArrayList<Carro>();

        for(int i = 0; i < this.listaDeCarros.size(); i += 1){
                 if(this.listaDeCarros.get(i).getMarca().equals(carro.getMarca()) ||
                    this.listaDeCarros.get(i).getModelo().equals(carro.getModelo()) ||
                    this.listaDeCarros.get(i).getCor().equals(carro.getCor()) ||
                    this.listaDeCarros.get(i).getAno() == carro.getAno()) {
                        listaFiltradaDeCarros.add(this.listaDeCarros.get(i));
                }
            }
        return listaFiltradaDeCarros;
    }


    @Override
    public String toString() {
        return "Lista de Carros " + listaDeCarros;
    }
}
