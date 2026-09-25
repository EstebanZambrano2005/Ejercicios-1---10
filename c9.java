import java.util.Scanner;

public class c9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes que participarán en la encuesta: ");
        int totalEstudiantes = scanner.nextInt();

        while (totalEstudiantes <= 0) {
            System.out.print("Por favor, ingrese un número válido de estudiantes (> 0): ");
            totalEstudiantes = scanner.nextInt();
        }

        int sumaEdades = 0;
        double sumaHorasEstudio = 0;
        
        int maxHoras = -1;
        int estudianteMaxHoras = 0;

        int contadorMenosDeDosHoras = 0;

        int[] edades = new int[totalEstudiantes];
        int[] semestres = new int[totalEstudiantes];
        int[] horasEstudio = new int[totalEstudiantes];

        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("\n--- Datos del Estudiante " + (i + 1) + " ---");

            do {
                System.out.print("Ingrese edad (16-80): ");
                edades[i] = scanner.nextInt();
                if (edades[i] < 16 || edades[i] > 80) {
                    System.out.println("Error: La edad debe estar entre 16 y 80 años. Intente de nuevo.");
                }
            } while (edades[i] < 16 || edades[i] > 80);

            do {
                System.out.print("Ingrese semestre (1-10): ");
                semestres[i] = scanner.nextInt();
                if (semestres[i] < 1 || semestres[i] > 10) {
                    System.out.println("Error: El semestre debe estar entre 1 y 10. Intente de nuevo.");
                }
            } while (semestres[i] < 1 || semestres[i] > 10);

            do {
                System.out.print("Ingrese horas de estudio por día (0-24): ");
                horasEstudio[i] = scanner.nextInt();
                if (horasEstudio[i] < 0 || horasEstudio[i] > 24) {
                    System.out.println("Error: Las horas deben estar entre 0 y 24. Intente de nuevo.");
                }
            } while (horasEstudio[i] < 0 || horasEstudio[i] > 24);

            sumaEdades += edades[i];
            sumaHorasEstudio += horasEstudio[i];

            if (horasEstudio[i] > maxHoras) {
                maxHoras = horasEstudio[i];
                estudianteMaxHoras = (i + 1);
            }

            if (horasEstudio[i] < 2) {
                contadorMenosDeDosHoras++;
            }
        }

        double edadPromedio = (double) sumaEdades / totalEstudiantes;
        double horasPromedioEstudio = sumaHorasEstudio / totalEstudiantes;

        System.out.println("\n========================================");
        System.out.println("          RESULTADOS DE LA ENCUESTA       ");
        System.out.println("========================================");
        System.out.println("Edad promedio: " + edadPromedio + " años");
        System.out.println("Horas promedio de estudio por día: " + horasPromedioEstudio + " horas");
        System.out.println("Estudiante con mayor cantidad de horas: Estudiante #" + estudianteMaxHoras + " con " + maxHoras + " horas");
        System.out.println("Cantidad de estudiantes que estudian menos de 2 horas: " + contadorMenosDeDosHoras);

        System.out.println("\n--- Cantidad de Estudiantes por Semestre (1 al 10) ---");
        for (int s = 1; s <= 10; s++) {
            int contadorSemestre = 0;
            for (int i = 0; i < totalEstudiantes; i++) {
                if (semestres[i] == s) {
                    contadorSemestre++;
                }
            }
            if (contadorSemestre > 0) {
                System.out.println("Semestre " + s + ": " + contadorSemestre + " estudiante(s)");
            }
        }
        System.out.println("========================================");

        scanner.close();
    }
}