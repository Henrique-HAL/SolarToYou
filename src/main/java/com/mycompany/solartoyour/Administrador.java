/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

/**
 *
 * @author Henri
 */
public class Administrador {
    private String nome;
    private String senha;
    
   //Construtor do Objeto Administrador
    
   public Administrador(String nome,String senha){
       this.nome = nome;
       this.senha = senha;
   }
   
   //Encapsulamento//
   
   public String getNome(){
       return nome;
   }
   public String getSenha(){
       return senha;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setSenha(String senha){
       this.senha = senha;
   }
    
    
}
