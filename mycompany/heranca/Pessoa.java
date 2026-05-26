/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 1302615041
 */
public class Pessoa {
    
    String nome;
    String telefone;
    String email;
    int idade;
    
    public Pessoa( String nome, String telefone, String email, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibir(){ //  contrutor 
    System.out.println("Nome: " + this.nome);
    System.out.println("Telefone: " + this.telefone);
    System.out.println("Email:" + this.email);
    System.out.println("Idade" + this.idade);
    }
}
