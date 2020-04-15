package com.company;

public class Main {

    public static void main(String[] args) {
        Carro primeiroCarro = new Carro(
                400,
                0,
                4,
                "Sim",
                6,
                "Sim",
                10,
                0,
                "Mustang",
                "Vermelho",
                2020,
                "Ford",
                150
        );

       Carro segundoCarro = new Carro(
               200,
               0,
               2,
               "Não",
               6,
               "Não",
               5,
               0,
               "Uno",
               "Branco",
               2000,
               "Fiat",
               1120
       );

        Carro terceiroCarro = new Carro(
                250,
                0,
                4,
                "Não",
                6,
                "Sim",
                10,
                0,
                "Ka",
                "Vermelho",
                2015,
                "Ford",
                150
        );

        Carro ferramentaDePesquisaDeCarros = new Carro(
               null,
               null,
               "Mustang",
               "Ford",
               "Vermelho",
               0,
               0,
                2
        );

        Venda listaDeVendas = new Venda();

        listaDeVendas.adicionarCarroALista(primeiroCarro);
        listaDeVendas.adicionarCarroALista(segundoCarro);
        listaDeVendas.adicionarCarroALista(terceiroCarro);


        System.out.println("Lista dos carros a venda: " + listaDeVendas + "\n\n");

        System.out.println("Filtro de pesquisa: " + listaDeVendas.buscar(ferramentaDePesquisaDeCarros));
        }
}
