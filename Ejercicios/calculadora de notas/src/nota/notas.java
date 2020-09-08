/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import java.util.Scanner;

/**
 *
 * @author COLNGE
 */
public class notas {
    
public static void main(String[] args) {
        
    double nota1,nota2,nota3,nota4,nota5;
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingresse nota 1");
        nota1=teclado.nextDouble();
        System.out.println("ingresse nota 2");
        nota2=teclado.nextDouble();
        System.out.println("ingresse nota 3");
        nota3=teclado.nextDouble();
        System.out.println("ingresse nota 4");
        nota4=teclado.nextDouble();
        System.out.println("ingresse nota 5");
        nota5=teclado.nextDouble();
        
        
        Calculo calculo = new Calculo();
        calculo.notasop(nota1,nota2,nota3);
        calculo.resultadofinal();
        
        
    }
}
