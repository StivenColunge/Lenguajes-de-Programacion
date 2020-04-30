/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;


public class lol {
            String un_var = "Raiz cuadrada";

        System.out.println(un_var);
        
        //raiz cuadrada de un numero
        
        int un_num;
        
        System.out.println("Ingrese el numero => ");
        Scanner entradaNum = new Scanner (System.in); //Una variable de tipo scanner para ingresar datos con el teclado, en esta caso un numero int
        un_num = entradaNum.nextInt(); //al numero que vamos a ingresar le damos la propiedad Scanner para que este sea llamado por la consola, como es de tipo int lleva el .nextInt
       
        //hacemos el calculo, en este caso raiz cuadrada
        float un_result = (float) Math.sqrt(un_num);
        //imprimimos el resultado
        System.out.println("La raiz cuadrada de "+ un_num +  " es: " + un_result);
        
    }

    
    
    
}
