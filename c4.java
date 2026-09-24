import java.util.Scanner;

public class c4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        // Solicitar un número entre 2 y 10
        do {
            System.out.print("Ingrese un número entre 2 y 10: ");
            n = scanner.nextInt();

            if (n < 2 || n > 10) {
                System.out.println("Error: el número debe estar entre 2 y 10.");
            }

        } while (n < 2 || n > 10);

        // PRIMER PATRÓN
        System.out.println("\nPrimer patrón:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // SEGUNDO PATRÓN
        System.out.println("\nSegundo patrón:");

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // TERCER PATRÓN
        System.out.println("\nTercer patrón:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        scanner.close();
    }
}