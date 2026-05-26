/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author 1302615041
 */
public class Professor extends Pessoa{

     private Double salario;
     
     public Professor(String nome, String telefone, String email, int idade, double salario){
       super(nome, telefone, email, idade);
         this.salario = salario;
     }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    
   public void exibir(){
   super.exibir();
   System.out.println("Salario: " + this.salario);
   }
    
}
