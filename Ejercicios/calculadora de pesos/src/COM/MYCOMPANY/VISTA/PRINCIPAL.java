/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.MYCOMPANY.VISTA;

import COM.MYCOMPANY.VISTA.MENU;
import COM.MYCOMPANY.CONTROLADOR.LOGICAPERSONAS;
import java.awt.Menu;

public class PRINCIPAL {
//RELACIONES
private  MENU menu;
private  LOGICAPERSONAS logica;

public PRINCIPAL (){
        this.menu = new MENU (this);//relaciones con clase menu
        this.logica = new LOGICAPERSONAS ();       
}

public MENU getMenu(){
    return menu;
}

public LOGICAPERSONAS getLogicaPersonas(){
    return logica;
}
    public static void main(String[]args){
        PRINCIPAL principal = new PRINCIPAL();
        //saltos de clases 
        principal.getMenu().mostrarelmenuprincipal();
        
    }
    
}
