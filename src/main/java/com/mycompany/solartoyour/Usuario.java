/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solartoyour;

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
<<<<<<< HEAD
    public Usuario(String nome,String email,String senha) throws Exception{
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    //checa se o usuario a ser criado é um adm e atribue o valor ao is_admin
        DAO dao = new DAO();
        this.is_admin = dao.admin(this);
=======
    public Usuario(String nome,String email,String senha, boolean is_admin, int id_usuario){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.is_admin = false;
        this.id_usuario = id_usuario;
>>>>>>> 33ae4529986709c737832d8b7126ab2eb91d65c9
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
