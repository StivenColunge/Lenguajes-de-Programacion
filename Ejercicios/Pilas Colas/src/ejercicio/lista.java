package ejercicio;

import java.util.ArrayList;

public class lista {

    public static void imprimir(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento + "-");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<String>();

        lista1.add("trinsgulo");
        lista1.add("ROMBO");
        lista1.add("CIRCULO");

        lista1.set(0, "pepe");
        imprimir(lista1);
        lista1.add(2, "loks");
        imprimir(lista1);
        lista1.remove("CIRCULO");
        imprimir(lista1);
        System.out.println("cantidad d elelemntos en una lista" + lista1.size());
        if (lista1.contains("ANA")) {
            System.out.println("el nombre de ana si esta e la lista");
        } else {
            System.out.println("el nombre d eana no esta en laista");
        }
        System.out.println("el segundo nombre");
        lista1.clear();
        if (lista1.isEmpty()) {
            System.out.println("lista vacia");
        }

    }

}
