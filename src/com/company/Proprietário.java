package com.company;

public class Proprietário {
    private String nome;
    private String cpf;
    private String rg;
    private String dataDeNascimento;

    public Proprietário(String nome, String cpf, String rg, String dataDeNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Dados do proprietário: " +
                "Nome: " + nome + "\n" +
                "Cpf: " + cpf + "\n" +
                "Rg: " + rg + "\n" +
                "Data de nascimento: " + dataDeNascimento;
    }
}
