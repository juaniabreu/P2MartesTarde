import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainTriage {
    public static void main(String[] args) {
        ColaPrioridadTDA triage = new ColaPrioridadEstatica();
        triage.InicializarColaPrioridad();

        // Casos simulados: (paciente, prioridad)
        triage.AcolarPrioridad(1, 10);  // Dolor de cabeza leve
        triage.AcolarPrioridad(2, 80);  // Fractura expuesta
        triage.AcolarPrioridad(3, 100); // Paro cardíaco
        triage.AcolarPrioridad(4, 1);   // Raspón
        triage.AcolarPrioridad(5, 100); // Bobazo

        System.out.println("Atención en guardia (mayor prioridad primero):");
        while (!triage.ColaVacia()) {
            int paciente = triage.Primero();
            int prioridad = triage.Prioridad();
            String descripcion = switch (paciente) {
                case 1 -> "Dolor de cabeza leve";
                case 2 -> "Fractura expuesta";
                case 3 -> "Paro cardíaco";
                case 4 -> "Raspón";
                case 5 -> "Bobazo";
                default -> "Caso desconocido";
            };
            System.out.println("Atendiendo: " + descripcion + " (Prioridad: " + prioridad + ")");
            triage.Desacolar();
        }
    }
}
