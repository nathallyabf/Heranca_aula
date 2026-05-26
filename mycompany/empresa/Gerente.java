/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author 1302615041
 */
public class Gerente extends Funcionario {

    private String setor;
    
    public Gerente(String nome, double salario, String setor){
    
        super(nome, salario);
        this.setor = setor;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public double bonus(){
     return (salariototal = this.salario * 1.20);
    }
    
    
    
    @Override
    public void exibir() {
    super.exibir();
    System.out.println("Setor: " + this.setor);
    System.out.println("Salario: " + salariototal);
    }
    
    
}
