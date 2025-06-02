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
    private int Id_paineis;
   
    //Construtor do Objeto Paineis

    public Paineis(String modelo, String descricao, double preco) {
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
    
    }
    
    //Construtor para Atualizar BD so a inclusao Do Id//
    
    public Paineis(String modelo, String descricao, double preco,int Id_paineis){
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
        this.Id_paineis = Id_paineis;
    }
    
    //Construtor para Deletar Painel
    public Paineis(int Id_paineis){
        this.Id_paineis = Id_paineis;
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

    public int getId_paineis() {
        return Id_paineis;
    }

    public void setId_paineis(int Id_paineis) {
        this.Id_paineis = Id_paineis;
    }
    
    


}
