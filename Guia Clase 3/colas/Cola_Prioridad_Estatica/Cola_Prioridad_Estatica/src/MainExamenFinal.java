import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainExamenFinal {
    public static void main(String[] args) {
        ColaPrioridadTDA examen = new ColaPrioridadEstatica();
        examen.InicializarColaPrioridad();

        // 1: Regular (llega 8:00, prioridad 5)
        // 2: Promocionado (llega 8:30, prioridad 10)
        examen.AcolarPrioridad(1, 5);  // Regular
        examen.AcolarPrioridad(2, 10); // Promocionado

        // Simulación de salida
        int primero = examen.Primero();
        int prioridad = examen.Prioridad();
        String descripcion = switch (primero) {
            case 1 -> "Regular (8:00 AM)";
            case 2 -> "Promocionado (8:30 AM)";
            default -> "Desconocido";
        };
        System.out.println("Sale primero: " + descripcion + " (Prioridad: " + prioridad + ")");
    }
}
