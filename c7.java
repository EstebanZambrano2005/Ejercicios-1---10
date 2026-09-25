import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Saldo inicial de $100
        double saldo = 100.0;
        int opcion = 0;
        
        // Contadores y acumuladores
        int depositosRealizados = 0;
        int retirosRealizados = 0;
        double totalDepositado = 0.0;
        double totalRetirado = 0.0;
        
        do {
            // Menú principal
            System.out.println("\n=====================");
            System.out.println("   CAJERO ACADÉMICO");
            System.out.println("=====================");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Salir");
            System.out.println("=====================");
            System.out.print("Seleccione una opción: ");
            
            // Validación de entrada para la opción del menú
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
                opcion = 0; // Asignar un valor que active el caso default
                continue;
            }
            
            // Estructura switch para gestionar las opciones del menú
            switch (opcion) {
                case 1:
                    System.out.printf("\nSu saldo actual es: $%.2f\n", saldo);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    if (scanner.hasNextDouble()) {
                        double deposito = scanner.nextDouble();
                        // Validación: no permitir depósitos negativos o en cero
                        if (deposito > 0) {
                            saldo += deposito;
                            depositosRealizados++;   // Incrementa el contador
                            totalDepositado += deposito; // Acumula el total
                            System.out.println("¡Depósito realizado con éxito!");
                        } else {
                            System.out.println("Error: No se permiten depósitos negativos o de cero.");
                        }
                    } else {
                        System.out.println("Error: Monto inválido.");
                        scanner.next();
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    if (scanner.hasNextDouble()) {
                        double retiro = scanner.nextDouble();
                        // Validación: no permitir retiros negativos o en cero
                        if (retiro > 0) {
                            // Validación: no permitir retirar más dinero del disponible
                            if (retiro <= saldo) {
                                saldo -= retiro;
                                retirosRealizados++;   // Incrementa el contador
                                totalRetirado += retiro; // Acumula el total
                                System.out.println("¡Retiro realizado con éxito!");
                            } else {
                                System.out.println("Error: Fondos insuficientes. No puede retirar más de su saldo disponible.");
                            }
                        } else {
                            System.out.println("Error: No se permiten retiros negativos o de cero.");
                        }
                    } else {
                        System.out.println("Error: Monto inválido.");
                        scanner.next();
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- Movimientos Actuales ---");
                    System.out.println("Depósitos realizados: " + depositosRealizados);
                    System.out.println("Retiros realizados: " + retirosRealizados);
                    System.out.printf("Total depositado: $%.2f\n", totalDepositado);
                    System.out.printf("Total retirado: $%.2f\n", totalRetirado);
                    System.out.printf("Saldo actual: $%.2f\n", saldo);
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del cajero automático...");
                    break;
                    
                default:
                    // Validación: no aceptar opciones inexistentes
                    System.out.println("Error: Opción inexistente. Por favor, seleccione un número del 1 al 5.");
            }
            
        } while (opcion != 5); // El programa permanece activo hasta seleccionar Salir
        
        // Reporte final al salir del programa
        System.out.println("\n=================================");
        System.out.println("     RESUMEN FINAL DE SESIÓN");
        System.out.println("=================================");
        System.out.println("Depósitos realizados: " + depositosRealizados);
        System.out.println("Retiros realizados: " + retirosRealizados);
        System.out.printf("Total depositado: $%.2f\n", totalDepositado);
        System.out.printf("Total retirado: $%.2f\n", totalRetirado);
        System.out.printf("Saldo final: $%.2f\n", saldo);
        System.out.println("=================================");
        
        scanner.close();
    }
}