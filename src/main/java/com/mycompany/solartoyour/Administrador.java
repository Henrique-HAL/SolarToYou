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
    private String email;
    private String senha;
    private String is_admin;

    //Construtor do Objeto Administrador
    public Administrador(String nome, String email, String senha, String is_admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.is_admin = is_admin;
    }

    //Encapsulamento//
    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }

}

//<<<<<<< HEAD
//opa
//oi de novo
//opa
// opa 2
// bacalhau
//>>>>>>> 777a8491a8aa15dedccee10546bab7bfe4727d89
//=======

//>>>>>>> 3ef089655588d7cf40a0537a19e60c977d9c5f4e
