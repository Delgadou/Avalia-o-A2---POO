package com.company;

public class Marca {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int chassi;

    public Marca(){}

    public Marca(String modelo, String cor, int ano, String marca, int chassi) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Cor: " + this.cor + "\n" +
                "Ano: " + this.ano + "\n" +
                "Chassi: " + this.chassi;
    }
}
