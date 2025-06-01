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
    private String descricao;
    private double preco;
    private double potencia;
    private int Id;
   
    //Construtor do Objeto Paineis

    public Paineis(String modelo, String descricao, double preco, double potencia, int Id) {
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
        this.potencia = potencia;
        this.Id = Id;
    }
    
    //Encapsulamento

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    


}
