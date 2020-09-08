/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

/**
 *
 * @author COLNGE
 */
public class Calculo {
 
 double not1, not2, not3, sumanotas, notfinal;
 
 
 public void notasop (double not1, double not2,double not3){
     double promedio=0;    
     sumanotas= not1+not2+not3;
     notfinal=(sumanotas/3);
 }
 
 public void resultadofinal(){
     System.out.println("el vlor en dolares es: "+notfinal);
 } 
 
}    

