import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tablaInicial, tablaFinal;

        System.out.println("=== TABLA DE MULTIPLICAR CONFIGURABLE ===");

        // Validación: la tabla inicial no debe ser mayor que la tabla final
        do {
            System.out.print("Ingrese la tabla inicial: ");
            tablaInicial = scanner.nextInt();

            System.out.print("Ingrese la tabla final: ");
            tablaFinal = scanner.nextInt();

            if (tablaInicial > tablaFinal) {
                System.out.println("⚠️ Error: La tabla inicial no puede ser mayor que la tabla final. Intente de nuevo.\n");
            }
        } while (tablaInicial > tablaFinal);

        System.out.println("\n--- Generando Tablas ---\n");

        // Ciclos for anidados
        // Ciclo exterior: recorre desde la tabla inicial hasta la tabla final
        for (int i = tablaInicial; i <= tablaFinal; i++) {
            System.out.println("TABLA DEL " + i);
            
            // Ciclo interior: multiplica el número actual del 1 al 10
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
            System.out.println(); // Espacio en blanco entre tabla y tabla
        }

        scanner.close();
    }
}