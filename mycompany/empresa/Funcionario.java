/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author 1302615041
 */
public class Funcionario {

     public String nome;
     public double salario;
     double salariototal;
     
     public Funcionario(String nome, double salario){
     this.nome = nome;
     this.salario = salario;
     }
    
    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    double getSalario() {
        return salario;
    }

    void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double bonus(){
     return (salariototal = this.salario * 1.05);
    }
     
    
    public void exibir(){
     System.out.println("Nome: " + this.nome);
     System.out.println("Salario: " + this.salario);
     System.out.println("Salario: " + salariototal);
    
    }
  
}
