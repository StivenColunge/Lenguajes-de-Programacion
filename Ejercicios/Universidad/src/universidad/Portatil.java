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
public class Portatil extends Electrodomestico {
    
    
    String so;
    String tipoConectividad;

    public Portatil(String so, String tipoConectividad, double precioFinal, String color, String consumoEnergetico, double peso) {
        super(precioFinal, color, consumoEnergetico, peso);
        this.so = so;
        this.tipoConectividad = tipoConectividad;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getTipoConectividad() {
        return tipoConectividad;
    }

    public void setTipoConectividad(String tipoConectividad) {
        this.tipoConectividad = tipoConectividad;
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
        return "Portatil [so=" + so + ", tipoConectividad=" + tipoConectividad + ", " + super.toString()
				+ "]";
    }
    
    
    
    
}
