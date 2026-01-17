package edu.juan.agencia.data;

public class Auto {

    public String marca;
    public int anio;
    public String acabado;
    public String llantas;
    public String color;
    public String motor;
    public double precio;

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
