package ejercicio;

import java.util.LinkedList;
import java.util.Queue;

public class colas {

    public static void main(String[] args) {

        Queue<String> cola1 = new LinkedList<String>();
        System.out.println("INGRESAMPS TRES ELEMENOTS EN LA COLA:");
        cola1.add("piratas del caribe 1");
        cola1.add("piratas del caribe 2");
        cola1.add("piratas del caribe 3");
        cola1.add("piratas del caribe 4");
        cola1.add("piratas del caribe 5");
        System.out.println("Cantidad de elementos " + cola1.size());
        System.out.println("Extraemos un eemento de la cola " + cola1.poll());
        System.out.println("consultamos elementos en la cola " + cola1.size());
        System.out.println("consultamos el primer elemento de la cola sin extraerlo" + cola1.peek());
        System.out.println("cantidad de elementos en la cola" + cola1.size());
        System.out.println("extraemos uno d elos elementos de la cola mientras  no este vacia:");
        while (cola1.isEmpty()) {
            System.out.println(cola1.poll() + "-");
        }
        System.out.println();

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimir la cola de enteros");
        for (Integer elemento1 : cola2) {
            System.out.println(elemento1 + "-");
        }
        System.out.println();
        System.out.println("BORRAMOS");

    }
}
