
package COM.MYCOMPANY.CONTROLADOR;

import COM.MYCOMPANY.MODELO.PERSONA;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author COLNGE
 */
public class LOGICAPERSONAS {
    private List <PERSONA> listapersona;
    
    
    public  LOGICAPERSONAS(){
        this.listapersona = new ArrayList<>();
    }
    // ciclo de vida de uh softwre: analicis, diseño, prohgramar, pruebas, mejora continua.
    //analicis: negocios, dinero metodologias y entendder el problema requerimientos funci y decriopcon
    //diseño: muck up
    //progrmr codigo leer requerimientos y progrmarlos
    //testear el probgrama y posible sfallo
    //mejora continuaa: comercializar, usabilidad sefuridad vender el producto
    
    public boolean registroestudiante(PERSONA estudiante){
        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula()==estudiante.getCedula()) {
                return false;            
            }            
        }
        listapersona.add(estudiante);
        return true;
    }
    public List <PERSONA> listarestudiante(){
        return listapersona;
    }
    
    public PERSONA buscarestudiantes(int cedulaEst){
        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == cedulaEst) {
                return listapersona.get(i);            
            }            
        }
        return null;
    }

    public boolean modificarestudiantes(PERSONA estudiante){
        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula()==estudiante.getCedula()) {
                return false;            
            }            
        }
        listapersona.add(estudiante);
        return true;
    }
        public PERSONA eliminrestudiantes(int cedulaEst){
        for (int i = 0; i < listapersona.size(); i++) {
            if (listapersona.get(i).getCedula() == cedulaEst) {
                return listapersona.remove(i);            
            }            
        }
        return null;
    }
}
