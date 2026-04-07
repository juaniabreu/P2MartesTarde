import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class MainBuffet {
    public static void main(String[] args) {
        ColaTDA filaBuffet = new ColaEstatica();
        filaBuffet.InicializarCola();

        // Simulamos personas llegando al buffet
        filaBuffet.Acolar(1); // Persona 1
        filaBuffet.Acolar(2); // Persona 2
        filaBuffet.Acolar(3); // Persona 3
        filaBuffet.Acolar(4); // Persona 4
        filaBuffet.Acolar(5); // Persona 5

        System.out.println("Atención en el buffet (nadie se cuela):");
        while (!filaBuffet.ColaVacia()) {
            System.out.println("Atendiendo persona: " + filaBuffet.Primero());
            filaBuffet.Desacolar();
        }
    }
}

// Se usa la operación Acolar del TDA Cola común. Así, cada persona que llega se
// agrega al final de la cola y solo puede ser atendida cuando le toque su turno
// (FIFO). No se usa prioridad, solo la operación Acolar para mantener el orden justo.