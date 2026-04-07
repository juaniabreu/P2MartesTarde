import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainTicketsIT {
    public static void main(String[] args) {
        ColaPrioridadTDA tickets = new ColaPrioridadEstatica();
        tickets.InicializarColaPrioridad();

        // Simulamos tickets: (id, prioridad)
        tickets.AcolarPrioridad(1, 999); // Servidor principal roto
        tickets.AcolarPrioridad(2, 0); // No me gusta el fondo de pantalla

        System.out.println("Atención de tickets IT (mayor prioridad primero):");
        while (!tickets.ColaVacia()) {
            int ticket = tickets.Primero();
            int prioridad = tickets.Prioridad();
            String descripcion = switch (ticket) {
                case 1 -> "Servidor principal roto";
                case 2 -> "No me gusta el fondo de pantalla";
                default -> "Desconocido";
            };
            System.out.println("Atendiendo: " + descripcion + " (Prioridad: " + prioridad + ")");
            tickets.Desacolar();
        }
    }
}

// el sistema de tickets atenderá primero el problema del servidor, y solo
// cuando no haya urgencias, atenderá los pedidos menores como el fondo de pantalla.