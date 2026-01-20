package edu.juan.agencia.process;

import edu.juan.agencia.data.Auto;
import edu.juan.agencia.data.Carrito;
import java.util.Scanner;

/**
 *
 * Esta clase contiene la lógica del sistema de la agencia.
 * Se encarga del proceso de compra del automóvil y del manejo del carrito.
 */
public class AgenciaService {

    /**
     *
     * Carrito de compra del sistema
     */
    private static Carrito carrito = new Carrito();

    /**
     *
     * Este método controla el proceso completo de compra de un auto
     * @param sc lector de datos para la entrada del usuario
     * @return
     */
    public static void comprarAuto(Scanner sc) {

        sc.nextLine(); // limpiar buffer

        String marca = seleccionarMarca(sc);
        int anio = seleccionarAnio(sc);
        String acabado = seleccionar(sc, "Acabado", "Piel", "Cuero");
        String llantas = seleccionar(sc, "Llantas", "16\"", "18\"", "20\"");
        String color = seleccionar(sc, "Color", "Blanco", "Negro", "Rojo");
        String motor = seleccionar(sc, "Motor", "4 cilindros", "V6", "V8");

        Auto auto = new Auto(
                marca,
                anio,
                acabado,
                llantas,
                color,
                motor,
                500000
        );

        carrito.agregarAuto(auto);
        seleccionarPago(sc);
    }

    /**
     *
     * Este método muestra el ticket de compra
     * @return
     */
    public static void verTicket() {
        carrito.mostrarTicket();
    }

    // ================= MÉTODOS PRIVADOS =================

    /**
     *
     * Este método permite seleccionar la marca del auto
     * @param sc lector de datos
     * @return marca seleccionada
     */
    private static String seleccionarMarca(Scanner sc) {

        int op = 0;

        do {
            System.out.println("\nSeleccione el auto:");
            System.out.println("1. Mazda 3");
            System.out.println("2. Mazda 2");
            System.out.println("3. Ford Fiesta");
            System.out.println("4. Camaro");
            System.out.println("5. Mustang");
            System.out.println("6. Civic");
            System.out.print("Opción: ");

            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            op = sc.nextInt();

        } while (op < 1 || op > 6);

        String[] marcas = {
                "Mazda 3",
                "Mazda 2",
                "Ford Fiesta",
                "Camaro",
                "Mustang",
                "Civic"
        };

        return marcas[op - 1];
    }

    /**
     *
     * Este método permite seleccionar el año del auto
     * @param sc lector de datos
     * @return año seleccionado
     */
    private static int seleccionarAnio(Scanner sc) {

        int anio = 0;

        do {
            System.out.print("Año (2018-2025): ");

            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            anio = sc.nextInt();

        } while (anio < 2018 || anio > 2025);

        return anio;
    }

    /**
     *
     * Este método muestra un menú genérico de opciones
     * @param sc lector de datos
     * @param titulo título del menú
     * @param opciones opciones disponibles
     * @return opción seleccionada
     */
    private static String seleccionar(Scanner sc, String titulo, String... opciones) {

        int op = 0;

        do {
            System.out.println("\n" + titulo);
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.print("Opción: ");

            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }

            op = sc.nextInt();

        } while (op < 1 || op > opciones.length);

        return opciones[op - 1];
    }

    /**
     *
     * Este método gestiona la forma de pago del automóvil
     * @param sc lector de datos
     * @return
     */
    private static void seleccionarPago(Scanner sc) {

        String pago = seleccionar(sc, "Forma de pago", "Efectivo", "Tarjeta");
        String tipo = seleccionar(sc, "Pago", "Contado", "Mensualidades");
        String factura = seleccionar(sc, "¿Generar ticket para facturar?", "Sí", "No");

        System.out.println("\n✅ Compra registrada");
        System.out.println("Pago: " + pago);
        System.out.println("Tipo: " + tipo);
        System.out.println("Factura: " + factura);
    }
}
