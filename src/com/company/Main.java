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
                2015,
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
                12,
                0,
                "Ka",
                "Preto",
                2010,
                "Ford",
                2345
        );

        Venda listaDeVendas = new Venda();

        listaDeVendas.adicionarCarroALista(primeiroCarro);
        listaDeVendas.adicionarCarroALista(segundoCarro);
        listaDeVendas.adicionarCarroALista(terceiroCarro);

        System.out.println("Lista dos carros a venda: " + listaDeVendas);

        System.out.println("Lista de pesquisada avançada: " + listaDeVendas.buscar("Ford"));
    }
}
