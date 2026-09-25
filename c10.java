import java.util.Scanner;

public class c10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad máxima de vehículos a gestionar en el parqueadero: ");
        int capacidad = scanner.nextInt();

        while (capacidad <= 0) {
            System.out.print("Error: La capacidad debe ser mayor a 0. Intente nuevamente: ");
            capacidad = scanner.nextInt();
        }

        // Arreglos para almacenar los registros
        String[] placas = new String[capacidad];
        String[] tiposVehiculo = new String[capacidad];
        String[] roles = new String[capacidad];
        int[] horasEstacionado = new int[capacidad];
        String[] diasSemana = new String[capacidad];
        boolean[] boletoPerdido = new boolean[capacidad];
        double[] valoresPagados = new double[capacidad];

        int totalRegistrados = 0;
        int opcion = 0;

        // Bucle do-while principal para el menú del sistema
        do {
            System.out.println("\n========================================");
            System.out.println("          PARQUEADERO UNIVERSITARIO     ");
            System.out.println("========================================");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos registrados");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Mostrar recaudación");
            System.out.println("5. Salir");
            System.out.println("========================================");
            System.out.print("Seleccione una opción (1-5): ");
            opcion = scanner.nextInt();

            // Validación de opciones del menú (Casos límite)
            while (opcion < 1 || opcion > 5) {
                System.out.print("Opción inválida. Ingrese un número entre 1 y 5: ");
                opcion = scanner.nextInt();
            }

            // Estructura switch para el control del menú
            switch (opcion) {
                case 1:
                    if (totalRegistrados >= capacidad) {
                        System.out.println("\n¡Atención! El parqueadero ha alcanzado su capacidad máxima.");
                        break;
                    }

                    System.out.println("\n--- REGISTRO DE VEHÍCULO #" + (totalRegistrados + 1) + " ---");
                    
                    // Limpiar buffer
                    scanner.nextLine();

                    System.out.print("Ingrese la placa del vehículo: ");
                    placas[totalRegistrados] = scanner.nextLine();

                    // Validación del tipo de vehículo usando do-while
                    int tipoOp = 0;
                    do {
                        System.out.println("Seleccione el tipo de vehículo:");
                        System.out.println("1. Auto");
                        System.out.println("2. Moto");
                        System.out.println("3. Bicicleta");
                        System.out.print("Opción (1-3): ");
                        tipoOp = scanner.nextInt();
                        if (tipoOp < 1 || tipoOp > 3) {
                            System.out.println("Error: Opción no válida.");
                        }
                    } while (tipoOp < 1 || tipoOp > 3);

                    if (tipoOp == 1) tiposVehiculo[totalRegistrados] = "Auto";
                    else if (tipoOp == 2) tiposVehiculo[totalRegistrados] = "Moto";
                    else tiposVehiculo[totalRegistrados] = "Bicicleta";

                    // Validación del rol usando do-while
                    int rolOp = 0;
                    do {
                        System.out.println("Seleccione el rol:");
                        System.out.println("1. Estudiante");
                        System.out.println("2. Docente");
                        System.out.println("3. Visitante");
                        System.out.print("Opción (1-3): ");
                        rolOp = scanner.nextInt();
                        if (rolOp < 1 || rolOp > 3) {
                            System.out.println("Error: Rol no válido.");
                        }
                    } while (rolOp < 1 || rolOp > 3);

                    if (rolOp == 1) roles[totalRegistrados] = "Estudiante";
                    else if (rolOp == 2) roles[totalRegistrados] = "Docente";
                    else roles[totalRegistrados] = "Visitante";

                    // Validación de horas (Caso límite: 0 a 24 horas)
                    System.out.print("Ingrese el número de horas (1-24): ");
                    horasEstacionado[totalRegistrados] = scanner.nextInt();
                    while (horasEstacionado[totalRegistrados] <= 0 || horasEstacionado[totalRegistrados] > 24) {
                        System.out.print("Error: Las horas deben estar entre 1 y 24. Intente de nuevo: ");
                        horasEstacionado[totalRegistrados] = scanner.nextInt();
                    }

                    // Día de la semana
                    scanner.nextLine();
                    System.out.print("Ingrese el día de la semana (ej. Lunes, Martes...): ");
                    diasSemana[totalRegistrados] = scanner.nextLine();

                    // Boleto perdido (S/N)
                    char boletoChar;
                    do {
                        System.out.print("¿Boleto perdido? (s/n): ");
                        boletoChar = scanner.next().toLowerCase().charAt(0);
                        if (boletoChar != 's' && boletoChar != 'n') {
                            System.out.println("Error: Ingrese 's' para sí o 'n' para no.");
                        }
                    } while (boletoChar != 's' && boletoChar != 'n');

                    boletoPerdido[totalRegistrados] = (boletoChar == 's');

                    // Cálculo de tarifas definidas por el equipo
                    double tarifaBaseHora = 1.50;
                    if (tiposVehiculo[totalRegistrados].equals("Moto")) tarifaBaseHora = 1.00;
                    if (tiposVehiculo[totalRegistrados].equals("Bicicleta")) tarifaBaseHora = 0.50;

                    double subtotal = horasEstacionado[totalRegistrados] * tarifaBaseHora;

                    // Descuento o recargo según rol o caso límite
                    if (roles[totalRegistrados].equals("Estudiante")) {
                        subtotal = subtotal * 0.80; // 20% de descuento para estudiantes
                    } else if (roles[totalRegistrados].equals("Docente")) {
                        subtotal = subtotal * 0.90; // 10% de descuento para docentes
                    }

                    // Multa fija por boleto perdido ($10.00)
                    if (boletoPerdido[totalRegistrados]) {
                        subtotal += 10.00;
                    }

                    valoresPagados[totalRegistrados] = subtotal;
                    totalRegistrados++;
                    System.out.println("\n¡Vehículo registrado con éxito! Total a pagar calculado: $" + subtotal);
                    break;

                case 2:
                    if (totalRegistrados == 0) {
                        System.out.println("\nNo hay vehículos registrados todavía.");
                    } else {
                        System.out.println("\n--- LISTA DE VEHÍCULOS REGISTRADOS ---");
                        // Bucle for clásico para recorrer el arreglo
                        for (int i = 0; i < totalRegistrados; i++) {
                            System.out.println("Vehículo " + (i + 1) + " [Placa: " + placas[i] + 
                                               ", Tipo: " + tiposVehiculo[i] + 
                                               ", Rol: " + roles[i] + 
                                               ", Horas: " + horasEstacionado[i] + 
                                               ", Día: " + diasSemana[i] + 
                                               ", Boleto perdido: " + (boletoPerdido[i] ? "Sí" : "No") + 
                                               ", Valor pagado: $" + valoresPagados[i] + "]");
                        }
                    }
                    break;

                case 3:
                    if (totalRegistrados == 0) {
                        System.out.println("\nNo hay datos suficientes para mostrar estadísticas.");
                    } else {
                        System.out.println("\n--- ESTADÍSTICAS GENERALES ---");
                        System.out.println("Vehículos registrados: " + totalRegistrados);

                        // Contadores por tipo usando bucles anidados
                        String[] tiposDisponibles = {"Auto", "Moto", "Bicicleta"};
                        for (int t = 0; t < tiposDisponibles.length; t++) {
                            int contTipo = 0;
                            for (int i = 0; i < totalRegistrados; i++) {
                                if (tiposVehiculo[i].equals(tiposDisponibles[t])) {
                                    contTipo++;
                                }
                            }
                            System.out.println("Cantidad de " + tiposDisponibles[t] + "s: " + contTipo);
                        }

                        // Contadores por rol usando bucles anidados
                        String[] rolesDisponibles = {"Estudiante", "Docente", "Visitante"};
                        for (int r = 0; r < rolesDisponibles.length; r++) {
                            int contRol = 0;
                            for (int i = 0; i < totalRegistrados; i++) {
                                if (roles[i].equals(rolesDisponibles[r])) {
                                    contRol++;
                                }
                            }
                            System.out.println("Cantidad de rol " + rolesDisponibles[r] + ": " + contRol);
                        }

                        // Acumulador de horas y promedio de permanencia
                        int totalHoras = 0;
                        for (int i = 0; i < totalRegistrados; i++) {
                            totalHoras += horasEstacionado[i];
                        }
                        double promedioPermanencia = (double) totalHoras / totalRegistrados;
                        System.out.println("Total de horas de estacionamiento: " + totalHoras);
                        System.out.println("Promedio de permanencia: " + promedioPermanencia + " horas");
                    }
                    break;

                case 4:
                    if (totalRegistrados == 0) {
                        System.out.println("\nNo hay registros de recaudación.");
                    } else {
                        double totalRecaudado = 0;
                        double mayorValor = valoresPagados[0];
                        double menorValor = valoresPagados[0];

                        // Bucle while auxiliar para procesar acumulador y casos límite de montos
                        int idx = 0;
                        while (idx < totalRegistrados) {
                            totalRecaudado += valoresPagados[idx];
                            if (valoresPagados[idx] > mayorValor) {
                                mayorValor = valoresPagados[idx];
                            }
                            if (valoresPagados[idx] < menorValor) {
                                menorValor = valoresPagados[idx];
                            }
                            idx++;
                        }

                        System.out.println("\n--- REPORTE DE RECAUDACIÓN ---");
                        System.out.println("Total recaudado: $" + totalRecaudado);
                        System.out.println("Mayor valor pagado: $" + mayorValor);
                        System.out.println("Menor valor pagado: $" + menorValor);
                    }
                    break;

                case 5:
                    System.out.println("\nSaliendo del sistema del parqueadero. ¡Hasta luego!");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}