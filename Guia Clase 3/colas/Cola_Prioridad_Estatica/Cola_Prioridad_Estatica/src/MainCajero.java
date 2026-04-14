import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainCajero {
    public static void main(String[] args) {
        ColaPrioridadTDA filaCajero = new ColaPrioridadEstatica();
        filaCajero.InicializarColaPrioridad();

        // Clientes: (número, prioridad)
        filaCajero.AcolarPrioridad(101, 1); // Cliente común
        filaCajero.AcolarPrioridad(102, 2); // Cliente con privilegio
        filaCajero.AcolarPrioridad(103, 1); // Cliente común
        filaCajero.AcolarPrioridad(104, 5); // Emergencia médica
        filaCajero.AcolarPrioridad(105, 3); // Cliente con más privilegio

        System.out.println("Atención en el cajero (mayor prioridad primero):");
        while (!filaCajero.ColaVacia()) {
            System.out.println("Atendiendo cliente: " + filaCajero.Primero() + " (Prioridad: " + filaCajero.Prioridad() + ")");
            filaCajero.Desacolar();
        }
    }
}
