/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

/**
 *
 * @author USER
 */
public class Paineis {
    
    private String modelo;
    private double preco;
    private String tipo_eficiencia;
    private int eficiencia;
    private int potencia_maxima;
    
    //Construtor do Objeto Paineis

    public Paineis(String modelo, double preco, String tipo_eficiencia, int eficiencia, int potencia_maxima) {
        this.modelo = modelo;
        this.preco = preco;
        this.tipo_eficiencia = tipo_eficiencia;
        this.eficiencia = eficiencia;
        this.potencia_maxima = potencia_maxima; 
    }
    
    //Encapsulamento

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getTipo_eficiencia() {
        return tipo_eficiencia;
    }
    public void setTipo_eficiencia(String tipo_eficiencia) {
        this.tipo_eficiencia = tipo_eficiencia;
    }
    public int getPotencia_maxima() {
        return potencia_maxima;
    }
    public void setPotencia_maxima(int potencia_maxima) {
        this.potencia_maxima = potencia_maxima;
    }
    public int getEficiencia() {
        return eficiencia;
    }
    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }


}
