/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author 1302615041
 */
public class Desenvolvedor extends Funcionario{

     private String lgP;
     
     public Desenvolvedor(String nome, double salario, String lgP){
         super(nome, salario);
         this.lgP = lgP;
     } 
    
    public String getLgP() {
        return lgP;
    }

    public void setLgP(String lgP) {
        this.lgP = lgP;
    }
    
   @Override
    public double bonus(){
     return (salariototal = this.salario * 1.15);
    }    
    
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Linguagem: " + this.lgP);
         System.out.println("Salario: " + salariototal);
    }
    
}
