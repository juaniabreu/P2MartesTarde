import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainScheduler {
    public static void main(String[] args) {
        ColaPrioridadTDA scheduler = new ColaPrioridadEstatica();
        scheduler.InicializarColaPrioridad();

        // Simulamos procesos: (id, prioridad)
        scheduler.AcolarPrioridad(1, 50); // Proceso del sistema
        scheduler.AcolarPrioridad(2, 10); // Spotify (usuario)
        scheduler.AcolarPrioridad(3, 50); // Otro proceso del sistema
        scheduler.AcolarPrioridad(4, 10); // Navegador (usuario)
        scheduler.AcolarPrioridad(5, 10); // Editor de texto (usuario)

        System.out.println("Procesos atendidos por el scheduler (mayor prioridad primero):");
        while (!scheduler.ColaVacia()) {
            int proceso = scheduler.Primero();
            int prioridad = scheduler.Prioridad();
            String descripcion = switch (proceso) {
                case 1 -> "Sistema (1)";
                case 2 -> "Spotify";
                case 3 -> "Sistema (2)";
                case 4 -> "Navegador";
                case 5 -> "Editor de texto";
                default -> "Desconocido";
            };
            System.out.println("Ejecutando: " + descripcion + " (Prioridad: " + prioridad + ")");
            scheduler.Desacolar();
        }
        System.out.println("\nSi el sistema se sobrecarga, los procesos de usuario pueden quedar esperando indefinidamente, porque los de sistema siempre tienen prioridad.");
    }
}
