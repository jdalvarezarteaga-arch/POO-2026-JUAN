package edu.juan.agencia.data;

public class Carrito {

    private Auto auto;

    public void agregarAuto(Auto auto) {
        this.auto = auto;
    }

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
