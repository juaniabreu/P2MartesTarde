import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class MainBalanceo {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        // Expresión: ( ( a + b ) * c )
        pila.Apilar("(");

        System.out.println("Aparece '(': Apilar");
        pila.Apilar("(");

        // ...a + b...

        System.out.println("Aparece ')': Desapilar");
        pila.Desapilar();

        // ...* c...

        System.out.println("Aparece ')': Desapilar");
        pila.Desapilar();

        // Al final, si la pila está vacía, está balanceada
        System.out.println("¿Pila vacía?: " + pila.PilaVacia());
        if (pila.PilaVacia()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila NO está vacía");
        }
    }
}
