/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author COLNGE
 */
public class Televisor extends Electrodomestico {
    
    
    String pulgadas;
    String tipoDePantalla;

    public Televisor(double precioFinal, String color, String consumoEnergetico, double peso) {
        super(precioFinal, color, consumoEnergetico, peso);
    }

    public Televisor(String pulgadas, String tipoDePantalla, double precioFinal, String color, String consumoEnergetico, double peso) {
        super(precioFinal, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tipoDePantalla = tipoDePantalla;
    }
    
    


    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipoDePantalla() {
        return tipoDePantalla;
    }

    public void setTipoDePantalla(String tipoDePantalla) {
        this.tipoDePantalla = tipoDePantalla;
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
    public double precioFinal(String letra, double peso) {
        return super.precioFinal(letra, peso); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprobarPeso(double peso) {
        super.comprobarPeso(peso); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprobarColor(String color) {
        super.comprobarColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comprobarLetra(String letra) {
        super.comprobarLetra(letra); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Televisor [pulgadas=" + pulgadas + ", tipoPantalla=" + tipoDePantalla + ", " + super.toString()
				+ "]"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    

    
    
    
    
    
}
