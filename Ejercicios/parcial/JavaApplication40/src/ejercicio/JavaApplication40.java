/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

public class JavaApplication40 {
  public static void main(String[] args) {
        
        float aux;
        float sum=0, rest=0;
        int positivos = 0;
        
        for (int i = 0; i < 6; i++) {
            Scanner entrada = new Scanner(System.in);
            aux=entrada.nextFloat();
            if(aux>=0){
                positivos++;
            }
            sum = sum+aux;
        
        rest = sum/6;
        }
        System.out.println(positivos+" positivo");
        System.out.println(rest);
   
    }

}
