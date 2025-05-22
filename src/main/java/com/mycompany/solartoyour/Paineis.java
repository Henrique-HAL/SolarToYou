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
    
    private String desvantagens;
    private String vantagens;
    private String tipo;
    private int eficiencia;
    private int custo;
    
    //Construtor do Objeto Paineis

    public Paineis(String desvantagens, String vantagens, String tipo, int eficiencia, int custo) {
        this.desvantagens = desvantagens;
        this.vantagens = vantagens;
        this.tipo = tipo;
        this.eficiencia = eficiencia;
        this.custo = custo; 
    }
    
    //Encapsulamento
    
    public String getDesvantagens() {
        return desvantagens;
    }

    public void setDesvantagens(String desvantagens) {
        this.desvantagens = desvantagens;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
