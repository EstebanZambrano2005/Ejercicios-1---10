import java.util.Scanner;

public class c5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Precios de los productos
        double precioCafe = 1.00;
        double precioSandwich = 2.50;
        double precioJugo = 1.50;
        double precioEmpanada = 1.25;

        // Contadores de productos vendidos
        int cafeVendido = 0;
        int sandwichVendido = 0;
        int jugoVendido = 0;
        int empanadaVendida = 0;

        // Contadores y acumuladores generales
        int numeroVentas = 0;
        int cantidadTotal = 0;
        double totalRecaudado = 0.0;

        int opcion;

        do {

            // MENÚ PRINCIPAL
            System.out.println("\n================================");
            System.out.println("      CAFETERIA UNIVERSITARIA");
            System.out.println("================================");
            System.out.println("1. Registrar venta");
            System.out.println("2. Mostrar estadisticas");
            System.out.println("3. Mostrar tabla de productos");
            System.out.println("4. Reiniciar estadisticas");
            System.out.println("5. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                // =========================================
                // 1. REGISTRAR VENTA
                // =========================================
                case 1:

                    System.out.println("\n--------- PRODUCTOS ---------");
                    System.out.println("1. Cafe       $1.00");
                    System.out.println("2. Sandwich   $2.50");
                    System.out.println("3. Jugo       $1.50");
                    System.out.println("4. Empanada   $1.25");
                    System.out.println("-----------------------------");

                    int producto;

                    do {
                        System.out.print("Seleccione el producto (1-4): ");
                        producto = scanner.nextInt();

                        if (producto < 1 || producto > 4) {
                            System.out.println("Error: producto invalido.");
                        }

                    } while (producto < 1 || producto > 4);

                    // Validar cantidad
                    int cantidad;

                    do {
                        System.out.print("Ingrese la cantidad: ");
                        cantidad = scanner.nextInt();

                        if (cantidad <= 0) {
                            System.out.println(
                                "Error: la cantidad debe ser mayor que cero."
                            );
                        }

                    } while (cantidad <= 0);

                    double precio = 0;
                    String nombreProducto = "";

                    // Determinar producto y precio
                    switch (producto) {

                        case 1:
                            precio = precioCafe;
                            nombreProducto = "Cafe";
                            cafeVendido += cantidad;
                            break;

                        case 2:
                            precio = precioSandwich;
                            nombreProducto = "Sandwich";
                            sandwichVendido += cantidad;
                            break;

                        case 3:
                            precio = precioJugo;
                            nombreProducto = "Jugo";
                            jugoVendido += cantidad;
                            break;

                        case 4:
                            precio = precioEmpanada;
                            nombreProducto = "Empanada";
                            empanadaVendida += cantidad;
                            break;
                    }

                    // Calcular total de la venta
                    double totalVenta = precio * cantidad;

                    // Actualizar acumuladores
                    numeroVentas++;
                    cantidadTotal += cantidad;
                    totalRecaudado += totalVenta;

                    System.out.println("\n===== VENTA REGISTRADA =====");
                    System.out.println("Producto: " + nombreProducto);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.printf("Precio unitario: $%.2f%n", precio);
                    System.out.printf("Total de la venta: $%.2f%n", totalVenta);
                    System.out.println("============================");

                    break;


                case 2:

                    System.out.println("\n======= ESTADISTICAS =======");

                    if (numeroVentas == 0) {

                        System.out.println("No existen ventas registradas.");

                    } else {

                        double promedioVenta =
                                totalRecaudado / numeroVentas;

                        // Determinar producto más vendido
                        String mayorProducto = "Cafe";
                        int mayorCantidad = cafeVendido;

                        if (sandwichVendido > mayorCantidad) {
                            mayorCantidad = sandwichVendido;
                            mayorProducto = "Sandwich";
                        }

                        if (jugoVendido > mayorCantidad) {
                            mayorCantidad = jugoVendido;
                            mayorProducto = "Jugo";
                        }

                        if (empanadaVendida > mayorCantidad) {
                            mayorCantidad = empanadaVendida;
                            mayorProducto = "Empanada";
                        }

                        // Determinar producto menos vendido
                        String menorProducto = "Cafe";
                        int menorCantidad = cafeVendido;

                        if (sandwichVendido < menorCantidad) {
                            menorCantidad = sandwichVendido;
                            menorProducto = "Sandwich";
                        }

                        if (jugoVendido < menorCantidad) {
                            menorCantidad = jugoVendido;
                            menorProducto = "Jugo";
                        }

                        if (empanadaVendida < menorCantidad) {
                            menorCantidad = empanadaVendida;
                            menorProducto = "Empanada";
                        }

                        System.out.println("Numero de ventas: " + numeroVentas);
                        System.out.println(
                            "Cantidad total de productos: " + cantidadTotal
                        );

                        System.out.printf(
                            "Total recaudado: $%.2f%n",
                            totalRecaudado
                        );

                        System.out.printf(
                            "Promedio por venta: $%.2f%n",
                            promedioVenta
                        );

                        System.out.println(
                            "Producto mas vendido: " +
                            mayorProducto +
                            " (" + mayorCantidad + " unidades)"
                        );

                        System.out.println(
                            "Producto menos vendido: " +
                            menorProducto +
                            " (" + menorCantidad + " unidades)"
                        );
                    }

                    System.out.println("============================");

                    break;


                case 3:

                    System.out.println("\n========== TABLA DE PRODUCTOS ==========");
                    System.out.println("Producto       Precio       Vendidos");
                    System.out.println("----------------------------------------");
                    System.out.printf(
                        "Cafe           $%.2f          %d%n",
                        precioCafe,
                        cafeVendido
                    );
                    System.out.printf(
                        "Sandwich       $%.2f          %d%n",
                        precioSandwich,
                        sandwichVendido
                    );
                    System.out.printf(
                        "Jugo           $%.2f          %d%n",
                        precioJugo,
                        jugoVendido
                    );
                    System.out.printf(
                        "Empanada       $%.2f          %d%n",
                        precioEmpanada,
                        empanadaVendida
                    );
                    System.out.println("========================================");

                    break;

                case 4:

                    System.out.println("\n¿Esta seguro de reiniciar las estadisticas?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Seleccione: ");

                    int confirmar = scanner.nextInt();

                    if (confirmar == 1) {

                        cafeVendido = 0;
                        sandwichVendido = 0;
                        jugoVendido = 0;
                        empanadaVendida = 0;

                        numeroVentas = 0;
                        cantidadTotal = 0;
                        totalRecaudado = 0.0;

                        System.out.println(
                            "Las estadisticas fueron reiniciadas."
                        );

                    } else {

                        System.out.println(
                            "Las estadisticas no fueron modificadas."
                        );
                    }

                    break;


                case 5:

                    System.out.println(
                        "\nGracias por utilizar el sistema de cafeteria."
                    );

                    break;

                default:

                    System.out.println(
                        "Error: opcion invalida. Seleccione entre 1 y 5."
                    );
            }

        } while (opcion != 5);

        scanner.close();
    }
}