package universidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COLNGE
 */
public class Electrodomestico {
    
    double precioFinal;
    String color;
    String consumoEnergetico;
    double peso;

    public Electrodomestico(double precioFinal, String color, String consumoEnergetico, double peso) {
        this.precioFinal = precioFinal;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioFinal=" + precioFinal + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    public void comprobarLetra(String letra){
        
        int precio;
        boolean comprobacion= false;
        //Comparaciones, numeros... ==
        // Strings .equals()  .equalsIgnoreCase()
        
        if(letra.equalsIgnoreCase("A") ){
            
            precio = 110;
        }
        else if(letra.equalsIgnoreCase("B")){
            precio = 85;
        }
        else if(letra.equalsIgnoreCase("C")){
            precio = 65;
        }
        else if(letra.equalsIgnoreCase("D")){
            precio = 55;
        }
        else if(letra.equalsIgnoreCase("E")){
            precio = 40;
        }
        else if(letra.equalsIgnoreCase("F")){
            precio= 15;
        }else{
            comprobacion= false;
        }
        
    }
    
    public void comprobarColor(String color){
        
        boolean siExiste;
        
        if(color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
                || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")){
            siExiste= true;
        }else{
            siExiste= false;
        }
    }
    
    public void comprobarPeso(double peso){
        
        double precio;
        boolean cumple;
        if(peso >= 0 && peso <= 19){
            precio=100;
        }
        else if(peso >= 20 && peso <= 49){
            precio = 50;
        }
        else if(peso >= 50 && peso <= 79){
            precio = 80;
        }
        else if(peso >= 80){
            precio = 150;
        }
        else{
            cumple= false;
        }
       
    }
    
    
    public double precioFinal(String letra, double peso){
        
        int precio=0;
        boolean comprobacion= false;
        //Comparaciones, numeros... ==
        // Strings .equals()  .equalsIgnoreCase()
        
        if(letra.equalsIgnoreCase("A") ){
            
            precio = 110;
        }
        else if(letra.equalsIgnoreCase("B")){
            precio = 85;
        }
        else if(letra.equalsIgnoreCase("C")){
            precio = 65;
        }
        else if(letra.equalsIgnoreCase("D")){
            precio = 55;
        }
        else if(letra.equalsIgnoreCase("E")){
            precio = 40;
        }
        else if(letra.equalsIgnoreCase("F")){
            precio= 15;
        }else{
            comprobacion= false;
        }
        
        
        
        double precio1=0;
        boolean cumple;
        if(peso >= 0 && peso <= 19){
            precio1=100;
        }
        else if(peso >= 20 && peso <= 49){
            precio1 = 50;
        }
        else if(peso >= 50 && peso <= 79){
            precio1 = 80;
        }
        else if(peso >= 80){
            precio1 = 150;
        }
        else{
            cumple= false;
        }
        double multiplicacion= precio * precio1;
        return multiplicacion; 
        
    }
    
}
