/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

/**
 *
 * @author Henri
 */
public class Usuario {
   
    private String nome;
    private String email;
    private String senha;
    private boolean is_admin;
    
    //Construtor do Obejto Usuario//
    public Usuario(String nome,String email,String senha, boolean is_admin){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.is_admin = false;
    }
    //Encapsulamento
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
    
}
