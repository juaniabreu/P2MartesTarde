import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class MainImpresora {
    public static void main(String[] args) {
        ColaTDA colaImpresora = new ColaEstatica();
        colaImpresora.InicializarCola();

        // Simulamos 5 archivos enviados a la impresora
        colaImpresora.Acolar(1); // Archivo 1
        colaImpresora.Acolar(2); // Archivo 2
        colaImpresora.Acolar(3); // Archivo 3
        colaImpresora.Acolar(4); // Archivo 4
        colaImpresora.Acolar(5); // Archivo 5

        System.out.println("Orden de impresión (FIFO):");
        while (!colaImpresora.ColaVacia()) {
            System.out.println("Imprimiendo archivo: " + colaImpresora.Primero());
            colaImpresora.Desacolar();
        }
    }
}
