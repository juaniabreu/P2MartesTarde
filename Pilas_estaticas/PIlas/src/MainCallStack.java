import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class MainCallStack {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        System.out.println("Main() inicia");
        pila.Apilar("Main"); // Main entra al stack

        System.out.println("Main() llama a CalcularPromedio()");
        pila.Apilar("CalcularPromedio"); // CalcularPromedio entra al stack

        System.out.println("CalcularPromedio() llama a Sumar()");
        pila.Apilar("Sumar"); // Sumar entra al stack

        System.out.println("En el momento de la suma, ¿quién está en el tope?: " + pila.Tope());
        // Aquí el tope es Sumar

        // Simulamos el retorno de Sumar
        System.out.println("Sumar() termina");
        pila.Desapilar();

        // Simulamos el retorno de CalcularPromedio
        System.out.println("CalcularPromedio() termina");
        pila.Desapilar();

        // Simulamos el retorno de Main
        System.out.println("Main() termina");
        pila.Desapilar();

        System.out.println("¿Pila vacía?: " + pila.PilaVacia());
    }
}
