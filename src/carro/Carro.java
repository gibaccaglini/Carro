package carro;

public class Carro {

    private String modelo;
    private String marca;
    private String cor;
    private int qtdPortas;
    private double motor;
    private char cambio;
    private int velocidade = 0;
    private boolean ligado = false;


    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public int acelerar(int aceleracao) {
        if (this.ligado) {
            this.velocidade = this.velocidade + aceleracao;
        } else {
            this.velocidade = 0;
        }

        return this.velocidade;
    }



    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public char getCambio() {
        return cambio;
    }

    public void setCambio(char cambio) {
        this.cambio = cambio;
    }
}
