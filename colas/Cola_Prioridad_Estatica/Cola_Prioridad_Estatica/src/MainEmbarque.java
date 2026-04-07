import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainEmbarque {
    public static void main(String[] args) {
        ColaPrioridadTDA embarque = new ColaPrioridadEstatica();
        embarque.InicializarColaPrioridad();

        // Simulamos pasajeros: (id, prioridad)
        embarque.AcolarPrioridad(1, 3); // Movilidad reducida
        embarque.AcolarPrioridad(2, 2); // Business 1
        embarque.AcolarPrioridad(3, 2); // Business 2
        embarque.AcolarPrioridad(4, 1); // Mortal 1
        embarque.AcolarPrioridad(5, 1); // Mortal 2

        System.out.println("Orden de embarque (mayor prioridad primero):");
        while (!embarque.ColaVacia()) {
            int pasajero = embarque.Primero();
            int prioridad = embarque.Prioridad();
            String descripcion = switch (pasajero) {
                case 1 -> "Movilidad reducida";
                case 2 -> "Business 1";
                case 3 -> "Business 2";
                case 4 -> "Mortal 1";
                case 5 -> "Mortal 2";
                default -> "Desconocido";
            };
            System.out.println("Sube: " + descripcion + " (Prioridad: " + prioridad + ")");
            embarque.Desacolar();
        }
        System.out.println("\nSi dos personas tienen la misma prioridad, sube primero quien llegó antes a la fila.");
    }
}
