/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 1302615041
 */
public class Aluno extends Pessoa {

     private String ra;
     
     public Aluno (String nome, String telefone, String email, int idade, String ra){
        super(nome, telefone, email, idade);
     this.ra = ra;
     }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("RA: " + this.ra);
    }

    
    
}
