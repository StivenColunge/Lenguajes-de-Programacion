/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.MYCOMPANY.MODELO;

import java.util.List;

/**
 *
 * @author COLNGE
 */
public class PERSONA {
    
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private List <PERSONA> propiedades;
    
    /**
 *
 * constructor para inicializar valores de un objeto perosna sin datos
 */
    public PERSONA (){
        this.cedula=1;
        this.nombres="";
        this.apellidos="";
        this.edad=1;    
    }
//     *
// * constructor para inicializar valores de un objeto perosna con datos
// */        
        public PERSONA (int cedula, String nombres, String apellidos,int edad ){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.edad=edad;    
    }
//     *
// * constructor para inicializar valores de un objeto perosna con un dato datos
// */        
        public PERSONA (int cedula){
        this.cedula=cedula;   
    }  
    //crear get y set de los atrubutos de la clase
        
    public int getCedula (){
        return cedula;
    }    
    public void setCedula (int cedula_que_llega){
        this.cedula=cedula_que_llega;
    }  

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<PERSONA> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<PERSONA> propiedades) {
        this.propiedades = propiedades;
    }
    // clase para imprimir bonito los datos e la calse

    @Override
    public String toString() {
        return "PERSONA{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", "
                + "edad=" + edad + '}';
    }

        
}
