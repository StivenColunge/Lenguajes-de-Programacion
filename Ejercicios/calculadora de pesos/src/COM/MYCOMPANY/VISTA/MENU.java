/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.MYCOMPANY.VISTA;

import COM.MYCOMPANY.MODELO.PERSONA;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author COLNGE
 */
public class MENU {

//    relacionas
    public PRINCIPAL objetoPrincipal;
    public Scanner lector;
//    contructora

    public MENU(PRINCIPAL principal) {
        this.objetoPrincipal = principal;
        this.lector = new Scanner(System.in);
    }

    public void mostrarelmenuprincipal() {
        int opcionSeleccion = -1;
        do {
            System.out.println("BIENBENIDO al COLEGIO FEDERICO GARCIA LORCA");
            System.out.println("1 para gestionar personas");
            System.out.println("2 gestionar eventos");
            System.out.println("3 salir ");
            opcionSeleccion = lector.nextInt();
            switch (opcionSeleccion) {
                case 1:
                    mostrarelmenucliente();
                    break;
                case 2:
//                    mostrarelmenuprincipal()para un futuro;
                case 3:
                    opcionSeleccion = 0;
                    System.out.println("GRACIAS `por utilizar el programa");
                    break;
                default:
                    System.out.println("DIGITE BIEN");
                    break;

            }
        } while (opcionSeleccion != 0);
    }

    public void mostrarelmenucliente() {
        int opc = -1;
        do {
            System.out.println(" MODULO 1: getion personas ");
            System.out.println("1 para Regustro estudiantes");
            System.out.println("2 para Listar estudiantes");
            System.out.println("3 para Buscar estudiantes");
            System.out.println("4 para Modifcar estudiantes");
            System.out.println("5 para Eliminar estudiantes");
            System.out.println("6 para Regresar al menu principal");
            opc = lector.nextInt();
            switch (opc) {
                case 1:
                    registroestudiantes();
                    break;
                case 2:
                    listarestudiante();
                    break;
                case 3:
                    buscarestudiantes();
                    break;
                case 4:
                    modificarestudiantes();
                    break;
                case 5:
                    eliminrestudiantes();
                    break;
                case 6:
                    opc = 0;
                    System.out.println("6 regresar al menu principal");
                    break;
                default:
                    System.out.println("DIGITE BIEN");
                    break;

            }

        } while (opc != 0);
    }

    public void registroestudiantes() {
        PERSONA estudiante = new PERSONA();
        System.out.println("digite la CEDULA");
        estudiante.setCedula(lector.nextInt());

        System.out.println("digite la NOMBRE");
        estudiante.setNombres(lector.next());

        System.out.println("digite la APELLIDO");
        estudiante.setApellidos(lector.next());

        System.out.println("digite la EDAD");
        estudiante.setEdad(lector.nextInt());

        //conectar la logica
        if (objetoPrincipal.getLogicaPersonas().registroestudiante(estudiante)) {
            System.out.println("SE REGISTRO BIEN");
        } else {
            System.out.println("no se REGISTRO BIEN");
        }
    }

    public void listarestudiante() {
        List<PERSONA> estudiante = objetoPrincipal.getLogicaPersonas().listarestudiante();
        System.out.println("Estuintes Registrados ");
        for (int i = 0; i < estudiante.size(); i++) {
            System.out.println(estudiante.get(i).toString());
        }
    }

    public void buscarestudiantes() {

        System.out.println("Digite la CEDULA para BUSCAR");
        PERSONA estudiante = objetoPrincipal.getLogicaPersonas().buscarestudiantes(lector.nextInt());
        if (estudiante != null) {
            System.out.println("el estudiante buscado es ");
            System.out.println(estudiante.toString());
        } else {
            System.out.println("no se encontro");
        }
    }

    public void modificarestudiantes() {
        System.out.println("Digite a quien desea moificar");
        PERSONA estudiante = objetoPrincipal.getLogicaPersonas().buscarestudiantes(lector.nextInt());
        if (estudiante != null) {
            System.out.println("el estudiante a modificar es ");
            System.out.println(estudiante.toString());

            System.out.println("MODIFIQUE LOS DATOS Del ESTUDIANTE: ");
            System.out.println("digite la NUEVA cedula");
            estudiante.setCedula(lector.nextInt());

            System.out.println("digite el NUEVO nombre");
            estudiante.setNombres(lector.next());

            System.out.println("digite el NUEVO apellido");
            estudiante.setApellidos(lector.next());

            System.out.println("digite la NUEVA edad");
            estudiante.setEdad(lector.nextInt());

            //conectar la logica
            if (objetoPrincipal.getLogicaPersonas().registroestudiante(estudiante)) {
                System.out.println("se modifico BIEN");
            } else {
                System.out.println(" se modifico BIEN");
            }
        } else {
            System.out.println("No se encontro el estudiante ");
        }
    }

    public void eliminrestudiantes() {
        System.out.println("Estudiante que decea ELIMINAR ");
        PERSONA estudiante = objetoPrincipal.getLogicaPersonas().eliminrestudiantes(lector.nextInt());
        if (estudiante != null) {
            System.out.println("se ELIMINO PERFECTAMENTE");
        } else {
            System.out.println("No se ELIMINO el personaje :v O NO existe");
        }

    }

}
