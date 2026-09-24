import java.util.Scanner;

public class c3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contMotos = 0;
        int contAutos = 0;
        int contCamionetas = 0;

        double totalRecaudado = 0.0;

        char respuesta = 's';

        do {

            System.out.println("\n===== REGISTRO DE ESTACIONAMIENTO =====");
            System.out.println("1. Motocicleta ($0.50/h)");
            System.out.println("2. Automovil ($1.00/h)");
            System.out.println("3. Camioneta ($1.50/h)");
            System.out.print("Ingrese una opcion (1-3): ");

            int tipo = scanner.nextInt();

            if (tipo < 1 || tipo > 3) {
                System.out.println("Error: opcion invalida.");
                continue;
            }

            double horas;

            do {
                System.out.print("Ingrese las horas estacionado: ");
                horas = scanner.nextDouble();

                if (horas <= 0) {
                    System.out.println("Error: las horas deben ser mayores que cero.");
                }

            } while (horas <= 0);

            double tarifa = 0.0;

            switch (tipo) {

                case 1:
                    tarifa = 0.50;
                    contMotos++;
                    break;

                case 2:
                    tarifa = 1.00;
                    contAutos++;
                    break;

                case 3:
                    tarifa = 1.50;
                    contCamionetas++;
                    break;
            }

            double pagoVehiculo = horas * tarifa;

            totalRecaudado = totalRecaudado + pagoVehiculo;

            System.out.printf("Pago de este vehiculo: $%.2f%n", pagoVehiculo);

            System.out.print("Desea registrar otro vehiculo? (s/n): ");
            respuesta = scanner.next().toLowerCase().charAt(0);

        } while (respuesta == 's');

        int totalVehiculos = contMotos + contAutos + contCamionetas;

        double promedioPagado = 0.0;

        if (totalVehiculos > 0) {
            promedioPagado = totalRecaudado / totalVehiculos;
        }

        System.out.println("\n========== REPORTE FINAL ==========");
        System.out.println("Motocicletas: " + contMotos);
        System.out.println("Automoviles: " + contAutos);
        System.out.println("Camionetas: " + contCamionetas);
        System.out.println("Total de vehiculos: " + totalVehiculos);
        System.out.printf("Total recaudado: $%.2f%n", totalRecaudado);
        System.out.printf("Promedio pagado: $%.2f%n", promedioPagado);
        System.out.println("===================================");

        scanner.close();
    }
}