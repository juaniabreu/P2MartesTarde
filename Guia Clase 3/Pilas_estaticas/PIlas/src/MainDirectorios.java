import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class MainDirectorios {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        // Entramos a C:/
        pila.Apilar("C:/");
        System.out.println("Entraste a: " + pila.Tope());

        // Entramos a Usuarios
        pila.Apilar("Usuarios");
        System.out.println("Entraste a: " + pila.Tope());

        // Entramos a Documentos
        pila.Apilar("Documentos");
        System.out.println("Entraste a: " + pila.Tope());

        // Subir un nivel (volver a Usuarios)
        System.out.println("Subir un nivel...");
        pila.Desapilar();
        System.out.println("Ahora estás en: " + pila.Tope());

        // Subir otro nivel (volver a C:/)
        System.out.println("Subir un nivel...");
        pila.Desapilar();
        System.out.println("Ahora estás en: " + pila.Tope());
    }
}
