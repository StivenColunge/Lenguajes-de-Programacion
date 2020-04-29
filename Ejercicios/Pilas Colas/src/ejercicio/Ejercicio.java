package ejercicio;

import java.util.Stack;

public class Ejercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> pila1 = new Stack<>();
        System.out.println("ingrese tres tipos mde eelmentos en lapila");
        pila1.push("gato");
        pila1.push("perro");
        pila1.push("tigre");
        pila1.push("leon");
        pila1.push("panda");
        pila1.push("pollo");
        System.out.println("cantidad de elemntos en la pila" + pila1.size());
        System.out.println("extremos un elemenoto en la pila" + pila1.pop());
        System.out.println("cantidad de una pila" + pila1.size());
        System.out.println("consultamos el primer elemento d ela pila sin extraerlo" + pila1.peek());
        System.out.println("csntifd de elemntos ne una pila " + pila1.size());
        System.out.println("exytraemos uno a un cada elemnro de a pila mientras no este vacia");
        while (!pila1.isEmpty()) {
            System.out.println(pila1.pop() + "-");
        }
        System.out.println();

        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        pila2.push(77);

        System.out.println("imprimimos la pila de enteros");
        System.out.println(" 2 elemento " + pila2.get(3));

        for (Integer elemento : pila2) {
            System.out.println(elemento + "-");
        }
        System.out.println();
        System.out.println("borrar toda la pila");
        pila2.clear();
        System.out.println("cantifdad de elementos en la pila de enteros " + pila2.size());

    }

}
