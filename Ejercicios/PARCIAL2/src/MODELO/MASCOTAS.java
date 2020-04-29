
package MODELO;

import javax.swing.JTextField;


public class MASCOTAS {
    private String mascota;
    private String raza;
    private int edad;
    private String dueño;
    private int celular;
    

public MASCOTAS(String mascota,String raza,int edad,String dueño,int celular){
        
    this.mascota=mascota;
    this.raza=raza;
    this.edad=edad;
    this.dueño=dueño;
    this.celular=celular;
}

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getMascota() {
        return mascota;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getDueño() {
        return dueño;
    }

    public int getCelular() {
        return celular;
    }
    
    public String toString () {
        return "mascota{ "+" mascota = "+ mascota +
               ", raza =" + raza +
               ", edad =" + edad +
               ", dueño =" + dueño +
               ", celular =" + celular +"}";

}

    public void setMascota(JTextField jTextMASCOTA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getRaza(JTextField jTextRAZA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRaza(JTextField jTextRAZA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEdad(JTextField jTextEDAD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDueño(JTextField jTextDUEÑO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCelular(JTextField jTextCELULAR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
