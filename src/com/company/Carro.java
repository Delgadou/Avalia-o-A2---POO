package com.company;

public class Carro extends Marca{
    private Proprietário proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroDePortasDoCarro;
    private String tetoSolar;
    private int numeroDeMarchasDoCarro;
    private String cambioAutomatico;
    private int volumeDeCombustivel;
    private int marchaAtual;
    private boolean marchaRe;
    private int autonomiaDeViagem;

    public Carro(){
        super();
    }

    public Carro(int velocidadeMaxima,
                 int velocidadeAtual,
                 int numeroDePortasDoCarro,
                 String tetoSolar,
                 int numeroDeMarchasDoCarro,
                 String cambioAutomatico,
                 int volumeDeCombustivel,
                 int marchaAtual,
                 String modelo,
                 String cor,
                 int ano,
                 String marca,
                 int chassi){
                        super(modelo, cor, ano, marca, chassi);
                        this.velocidadeMaxima = velocidadeMaxima;
                        this.velocidadeAtual = velocidadeAtual;
                        this.numeroDePortasDoCarro = numeroDePortasDoCarro;
                        this.tetoSolar = tetoSolar;
                        this.numeroDeMarchasDoCarro = numeroDeMarchasDoCarro;
                        this.cambioAutomatico = cambioAutomatico;
                        this.volumeDeCombustivel = volumeDeCombustivel;
                        this.marchaAtual = marchaAtual;
                }

    public Proprietário getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietário proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroDePortasDoCarro() {
        return numeroDePortasDoCarro;
    }

    public void setNumeroDePortasDoCarro(int numeroDePortasDoCarro) {
        this.numeroDePortasDoCarro = numeroDePortasDoCarro;
    }

    public String getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getNumeroDeMarchasDoCarro() {
        return numeroDeMarchasDoCarro;
    }

    public void setNumeroDeMarchasDoCarro(int numeroDeMarchasDoCarro) {
        this.numeroDeMarchasDoCarro = numeroDeMarchasDoCarro;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public int getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    public void setVolumeDeCombustivel(int volumeDeCombustivel) {
        this.volumeDeCombustivel = volumeDeCombustivel;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public boolean isMarchaRe() {
        return marchaRe;
    }

    public void setMarchaRe(boolean marchaRe) {
        this.marchaRe = marchaRe;
    }

    public void setAutonomiaDeViagem(int autonomiaDeViagem) {
        this.autonomiaDeViagem = autonomiaDeViagem;
    }

    public void acelerar(){
        this.velocidadeAtual++;
    }

    public void frear(){
        this.velocidadeAtual = 0;
    }

    public void trocaDeMarcha(){
        this.marchaAtual++;
    }

    public void reduzirMarcha(){
        this.marchaAtual--;
    }

    public void mudandoParaMarchaRe(){
        if(marchaAtual == -1 && velocidadeAtual >0){
            System.out.println("Não é possivel engatar a marcha ré em movimento.");
            return;
        }else if(marchaAtual == -1) {
            System.out.println("Voce ja esta na machar ré");
            return;
        }
        else{
            this.marchaAtual = -1;
        }
    }


    public void getAutonomiaDeViagem(){
        System.out.println("A autonomia de viagem é de " + this.autonomiaDeViagem + "KM");
    }

    public void calculoAutonomiaDeViagem(int kmPercorridosPorLitro){
        this.autonomiaDeViagem = kmPercorridosPorLitro * volumeDeCombustivel;
    }


    @Override
    public String toString() {
        return  "\nDados do carro: \n" +
                "Modelo do carro: " + super.getModelo() + "\n" +
                "Marca do carro: " + super.getMarca() + "\n" +
                "Cor do Carro: " + super.getCor() + "\n" +
                "Ano do carro: " + super.getAno() + "\n" +
                "Chassi do carro: " + super.getChassi() + "\n" +
                "VelocidadeMaxima: " + this.velocidadeMaxima + "\n" +
                "VelocidadeAtual: " + this.velocidadeAtual + "\n" +
                "Numero de portas do carro: " + this.numeroDePortasDoCarro + "\n" +
                "Teto Solar: " + this.tetoSolar + "\n" +
                "Numero de marchas do carro: " + this.numeroDeMarchasDoCarro + "\n" +
                "Cambio automatico: " + this.cambioAutomatico + "\n" +
                "Volume de combustivel: " + this.volumeDeCombustivel + " Litros \n" +
                "Marcha atual: " + this.marchaAtual + "\n" +
                "Marcha re: " + this.marchaRe + "\n";
    }


    public String conferirVelocidadeAtual() {
        return "A velocidade atual do carro é " + velocidadeAtual + "km/h";
    }}
