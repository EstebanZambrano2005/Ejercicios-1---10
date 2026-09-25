import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        // Validación del número entero positivo N
        while (true) {
            System.out.print("Ingrese N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a 0. Intente nuevamente.");
                }
            } else {
                System.out.println("Valor inválido. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        
        int contador = 0;
        int acumulador = 0;
        StringBuilder seriePares = new StringBuilder();
        
        // Estructura for para recorrer desde 2 hasta N avanzando de 2 en 2
        for (int i = 2; i <= n; i += 2) {
            seriePares.append(i).append(" ");
            contador++;       // Contador de números pares
            acumulador += i;  // Acumulador para la suma total
        }
        
        // Mostrar resultados
        System.out.println("\nSerie:");
        System.out.println(seriePares.toString().trim());
        
        System.out.println("\nCantidad de pares: " + contador);
        System.out.println("Suma: " + acumulador);
        
        if (contador > 0) {
            double promedio = (double) acumulador / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("Promedio: 0 (No hay números pares en el rango)");
        }
        
        scanner.close();
    }
}