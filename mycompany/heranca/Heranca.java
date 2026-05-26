/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author 1302615041
 */
public class Heranca {

    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa ("Nathy", "123", "danoninho@gmail.com", 13);
        p1.exibir();
        
        Aluno a1 = new Aluno ("Nathy", "123", "danoninho@gmail.com", 13, "12365");
        a1.exibir();
        
        Professor pf1 = new Professor("' Nathy", "12343", "email", 15, 200022);
        pf1.exibir();
    }
}
