/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author 1302615041
 */
public class Empresa {

    public static void main(String[] args) {
      
     Funcionario f1 = new Funcionario("Nathy", 200000);
     f1.exibir();
  
        
      Gerente g1 = new Gerente ( "Nathallya", 20000, "B23" );
      g1.exibir();
    
      
      Desenvolvedor d1 = new Desenvolvedor("noni", 80000, "Java");
      d1.exibir();
     
      
        
    }
}
