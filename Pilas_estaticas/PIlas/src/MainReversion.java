import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class MainReversion {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        // Palabra: ALGORITMOS
        pila.Apilar("A");
        pila.Apilar("L");
        pila.Apilar("G");
        pila.Apilar("O");
        pila.Apilar("R");
        pila.Apilar("I");
        pila.Apilar("T");
        pila.Apilar("M");
        pila.Apilar("O");
        pila.Apilar("S");

        System.out.print("Palabra invertida: ");
        while (!pila.PilaVacia()) {
            System.out.print(pila.Tope());
            pila.Desapilar();
        }
        System.out.println();

        // Al final, si la pila está vacía
        System.out.println("Pila vacia?: " + pila.PilaVacia());
        if (pila.PilaVacia()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("La pila NO esta vacia");
        }
    }
}
