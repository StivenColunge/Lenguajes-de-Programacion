/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.Scanner;

/**
 *Parce, cual es el proyecto? es6s c4atr6 
 * @author COLNGE
 */
public class Universidad {

    static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BIENVENIDO");
        boolean sirve = false;
        do {
            System.out.println("1 registrar TV");
            System.out.println("2 registrar portatil");
            System.out.println("3 salir ");
            
            int opcionSeleccion = lector.nextInt();

            switch (opcionSeleccion) {
                case 1:
                    REGISTROTV();
                    break;
                case 2:
                    REGISTROPORTATIL();
                case 3:
                    System.exit(0);
                    System.out.println("GRACIAS `por utilizar el programa");
                    break;
                default:
                    System.out.println("DIGITE BIEN");
                    break;

            }

        } while (sirve == false);

    }

    public static void REGISTROTV() {

        boolean correcto = false;
        double precioFinal;
        String color;
        String consumoEnergetico;
        double peso;
        String pulgadas = null;
        String tipoDePantalla;

        do {
            System.out.println("ingrese los datos del TV");
            System.out.println("ingrese el color");
            color = lector.next();

            if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
                    || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
                correcto = true;
            } else {
                System.out.println("el color no existe");
                correcto=false;

            }

        } while (correcto == false);

        do {

            System.out.println("ingrese el letra y recuerde que: A $110\n"
                    + "B $85\n"
                    + "C $65\n"
                    + "D $55\n"
                    + "E $40\n"
                    + "F $15");
            consumoEnergetico = lector.next();

            if (consumoEnergetico.equalsIgnoreCase("A") || consumoEnergetico.equalsIgnoreCase("B") || consumoEnergetico.equalsIgnoreCase("C")
                    || consumoEnergetico.equalsIgnoreCase("D") || consumoEnergetico.equalsIgnoreCase("E") || consumoEnergetico.equalsIgnoreCase("F")) {
                correcto = true;
            } else {
                correcto=false;
                System.out.println("NO CORRESPONDE A LO ES PECIFICADO");
            }

        } while (correcto == false);

        do {

            System.out.println("ingrese el PESO");

            peso = lector.nextInt();
            
            if(peso > 0){
                correcto=true;
            }else{
                System.out.println("no puede ser negativo");
                correcto=false;
            }

        } while (correcto == false);

        do {

            System.out.println("ingrese las pulgadas (20 pulgadas, 24\n"
                    + "pulgadas, 32 pulgadas o 60 pulgadas");
            pulgadas = lector.next();

            if (pulgadas.equalsIgnoreCase("20") || pulgadas.equalsIgnoreCase("24") || pulgadas.equalsIgnoreCase("32")
                    || pulgadas.equalsIgnoreCase("60")) {
                correcto = true;
            } else {
                correcto=false;
                System.out.println("las pulgadas no existen");
            }

        } while (correcto == false);

        do {

            
            System.out.println("ingrese el tipo de pantalla: LED\n"
                    + "LCD\n"
                    + "OLE");
            tipoDePantalla = lector.next();

            if (tipoDePantalla.equalsIgnoreCase("LED") || tipoDePantalla.equalsIgnoreCase("LCD")
                    || tipoDePantalla.equalsIgnoreCase("OLE")) {
                correcto = true;
            } else {
                correcto=false;
                System.out.println("la *anta33a no existen");
                
            }

        } while (correcto == false);
    
        Televisor TV = new Televisor(pulgadas, tipoDePantalla, 0, color, consumoEnergetico, peso);
//        precioFinal = TV.precioFinal(consumoEnergetico, peso);
        double precioFinal1=TV.precioFinal(consumoEnergetico, peso);
        TV.setPrecioFinal(precioFinal1);
        System.out.println(TV);
    }
    

    public static void REGISTROPORTATIL(){
        
        boolean correcto = false;
        double precioFinal;
        String color;
        String consumoEnergetico;
        double peso;
        String so;
        String tipoConectividad;

        do {
            System.out.println("ingrese los datos del PORTATIL");
            System.out.println("ingrese el color");
            color = lector.next();

            if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
                    || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
                correcto = true;
            } else {
                System.out.println("el color no existe");
                correcto=false;

            }

        } while (correcto == false);

        do {

            System.out.println("ingrese el letra y recuerde que: A $110\n"
                    + "B $85\n"
                    + "C $65\n"
                    + "D $55\n"
                    + "E $40\n"
                    + "F $15");
            consumoEnergetico = lector.next();

            if (consumoEnergetico.equalsIgnoreCase("A") || consumoEnergetico.equalsIgnoreCase("B") || consumoEnergetico.equalsIgnoreCase("C")
                    || consumoEnergetico.equalsIgnoreCase("D") || consumoEnergetico.equalsIgnoreCase("E") || consumoEnergetico.equalsIgnoreCase("F")) {
                correcto = true;
            } else {
                correcto=false;
                System.out.println("NO CORRESPONDE A LO ES PECIFICADO");
            }

        } while (correcto == false);

        do {

            System.out.println("ingrese el PESO");

            peso = lector.nextInt();
            
            if(peso > 0){
                correcto=true;
            }else{
                System.out.println("no puede ser negativo");
                correcto=false;
            }

        } while (correcto == false);
        
         do {

            System.out.println("ingrese el SISTEMA OPERTIVO: Windows\n" +
"Linux");
            so = lector.next();

            if (so.equalsIgnoreCase("Windows") || so.equalsIgnoreCase("Linux")) {
                correcto = true;
            } else {
                System.out.println("el SISTEMA OPERTIVO no existe");
                correcto=false;

            }

        } while (correcto == false);
         
         do {

            System.out.println("ingrese el tipo de conectividad: WIFI O LAN");
            tipoConectividad = lector.next();

            if (tipoConectividad.equalsIgnoreCase("WIFI") || tipoConectividad.equalsIgnoreCase("LAN")) {
                correcto = true;
            } else {
                System.out.println("el tipo de conectividad no existe");
                correcto=false;
            }

        } while (correcto == false);
                 Portatil port = new Portatil(so, tipoConectividad, 0, color, consumoEnergetico, peso);
//        precioFinal = TV.precioFinal(consumoEnergetico, peso);
        double precioFinal1=port.precioFinal(consumoEnergetico, peso);
        port.setPrecioFinal(precioFinal1);
        System.out.println(port);
    }


}
