import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Validar que el número de estudiantes sea mayor que 0
        do {
            System.out.print("Ingrese el número de estudiantes (mayor a 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("⚠️ Error: El número debe ser mayor que cero.");
            }
        } while (n <= 0);

        double sumaCalificaciones = 0;
        int aprobados = 0;
        int reprobados = 0;
        double notaAlta = -1.0; // Se inicializa con un valor menor al mínimo posible
        double notaBaja = 11.0; // Se inicializa con un valor mayor al máximo posible

        // Ingreso y procesamiento de calificaciones
        for (int i = 1; i <= n; i++) {
            double calificacion;

            // Validar que la calificación esté entre 0 y 10
            do {
                System.out.print("Ingrese la calificación del estudiante " + i + " (0 a 10): ");
                calificacion = scanner.nextDouble();
                if (calificacion < 0 || calificacion > 10) {
                    System.out.println("⚠️ Error: La calificación debe estar entre 0 y 10.");
                }
            } while (calificacion < 0 || calificacion > 10);

            // 1. Suma de calificaciones
            sumaCalificaciones += calificacion;

            // 2. Cantidad de aprobados y reprobados (Asumiendo nota mínima de aprobación = 7)
            if (calificacion >= 7.0) {
                aprobados++;
            } else {
                reprobados++;
            }

            // 3. Nota más alta y nota más baja
            if (calificacion > notaAlta) {
                notaAlta = calificacion;
            }
            if (calificacion < notaBaja) {
                notaBaja = calificacion;
            }
        }

        // 4. Promedio general
        double promedioGeneral = sumaCalificaciones / n;

        // Mostrar resultados finales
        System.out.println("\n========== REPORTE FINAL ==========");
        System.out.println("Número de estudiantes: " + n);
        System.out.println("Suma de calificaciones: " + sumaCalificaciones);
        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
        System.out.println("Calificación más alta: " + notaAlta);
        System.out.println("Calificación más baja: " + notaBaja);
        System.out.println("===================================");

        scanner.close();
    }
}