package ejercicio;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class COLA_PRORITARIA {

    public static void main(String[] args) {

        PriorityQueue<Integer> cola3 = new PriorityQueue<Integer>();
        cola3.add(70);
        cola3.add(120);
        cola3.add(6);
        System.out.println("Imprimir la cola con prioridades de enteros");
        while (!cola3.isEmpty()) {
            System.out.println(cola3.poll() + "-");
        }

    }
}
