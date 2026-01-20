package edu.juan.agencia.data;

/**
 *
 * Esta clase representa un carrito de compra.
 * Se encarga de almacenar el auto seleccionado
 * y generar el ticket de compra.
 */
public class Carrito {

    /**
     *
     * Auto seleccionado para la compra
     */
    private Auto auto;

    /**
     *
     * Este método agrega un auto al carrito
     * @param auto auto seleccionado
     * @return
     */
    public void agregarAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     *
     * Este método muestra el ticket de compra en consola
     * @return
     */
    public void mostrarTicket() {
        if (auto == null) {
            System.out.println("❌ No hay compra registrada");
            return;
        }

        System.out.println("\n===== TICKET DE COMPRA =====");
        auto.mostrar();
        System.out.println("============================");
    }
}
