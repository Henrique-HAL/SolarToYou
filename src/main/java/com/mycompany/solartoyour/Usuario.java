/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

import java.sql.SQLException;

import DAO.DAO;

/**
 *
 * @author Henri
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean is_admin;
    private int id_usuario;

    //Construtor do Obejto Usuario//
    public Usuario(String nome, String email, String senha) throws Exception {
        this.nome = nome;
        this.email = email;
        this.senha = senha;

        //coloca os devidos valores ao is_admin (boolean) e ao id_usuario
        DAO dao = new DAO();
        this.is_admin = dao.admin(this);
        this.id_usuario = dao.id_usuario(this);
    }

    public Usuario(String id_usuario) throws SQLException{
        String[] valores = DAO.usuario(id_usuario);
        this.nome = valores[0];
        this.email = valores[1];
        this.senha = valores[2];
    }
       
    public Usuario(String nome, String senha) throws Exception {
        this.nome = nome;
        this.senha = senha;
    }

    //Encapsulamento
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getIs_admin() {
        return is_admin;
    }

    public int getId_usuario() {
        return id_usuario;
    }
}
