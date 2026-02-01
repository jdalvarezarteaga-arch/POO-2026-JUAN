package edu.juan.agencia.Act3.modelos;

public class Empleado {
    private double salario;
    private int edad;
    private String departamento;


    public Empleado(double salario, int edad, String departamento) {
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }

    public double getSalario() { return salario; }
    public int getEdad() { return edad; }
    public String getDepartamento() { return departamento; }
}