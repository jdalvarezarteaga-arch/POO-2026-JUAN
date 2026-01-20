package edu.juan.agencia.data;

/**
 *
 * Esta clase representa un automóvil de la agencia.
 * Almacena todas las características y el precio del auto.
 */
public class Auto {

    /**
     *
     * Marca del automóvil
     */
    public String marca;

    /**
     *
     * Año del automóvil
     */
    public int anio;

    /**
     *
     * Acabado del automóvil
     */
    public String acabado;

    /**
     *
     * Tipo de llantas del automóvil
     */
    public String llantas;

    /**
     *
     * Color del automóvil
     */
    public String color;

    /**
     *
     * Tipo de motor del automóvil
     */
    public String motor;

    /**
     *
     * Precio del automóvil
     */
    public double precio;

    /**
     *
     * Constructor del automóvil
     * @param marca marca del auto
     * @param anio año del auto
     * @param acabado tipo de acabado
     * @param llantas tipo de llantas
     * @param color color del auto
     * @param motor tipo de motor
     * @param precio precio del automóvil
     */
    public Auto(String marca, int anio, String acabado,
                String llantas, String color, String motor, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.acabado = acabado;
        this.llantas = llantas;
        this.color = color;
        this.motor = motor;
        this.precio = precio;
    }

    /**
     *
     * Este método muestra en consola la información del automóvil
     * @return
     */
    public void mostrar() {
        System.out.println("Auto: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Acabado: " + acabado);
        System.out.println("Llantas: " + llantas);
        System.out.println("Color: " + color);
        System.out.println("Motor: " + motor);
        System.out.println("Precio: $" + precio);
    }
}
