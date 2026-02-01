package edu.juan.agencia.Act3;
import edu.juan.agencia.Act3.modelos.Empleado;
import edu.juan.agencia.Act3.procces.Lista_de_empleados;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Test_lista_de_empleados {Lista_de_empleados programa = new Lista_de_empleados();


    List<Empleado> listaPrueba = Arrays.asList(
            new Empleado(10000, 20, "Ventas"),
            new Empleado(30000, 30, "Sistemas"), // Gana > 25k
            new Empleado(40000, 40, "Sistemas"), // Gana > 25k
            new Empleado(10000, 20, "RH")
    );

    @Test
    public void mayor_de_salario() {
        Empleado resultado = programa.mayorsalario(listaPrueba);
        assertEquals(40000.0, resultado.getSalario(), 0.001);
    }

    @Test
    public void edad_mas_comun() {

        int resultado = programa.edadcomun(listaPrueba);
        assertEquals(20, resultado);
    }

    @Test
    public void promedio_de_la_edad() {

        double resultado = programa.promedioedad(listaPrueba);
        assertEquals(27.5, resultado, 0.001);
    }

    @Test
    public void promedio_del_salario() {

        double resultado = programa.promediosalario(listaPrueba);
        assertEquals(22500.0, resultado, 0.001);
    }

    @Test
    public void edad_con_el_salario_mayora_a_25() {

        double resultado = programa.edadconsalariomayor25(listaPrueba);
        assertEquals(35.0, resultado, 0.001);
    }

    @Test
    public void menor_que_25() {

        List<Empleado> resultado = programa.menor25(listaPrueba);

        assertEquals(2, resultado.size());
        assertEquals(20, resultado.get(0).getEdad());
    }

    @Test
    public void empleados_de_los_sistemas() {

        int resultado = programa.empleadosdesistemas(listaPrueba);
        assertEquals(2, resultado);
    }
    @Test
    public void test_del_Mayor_Salario_que_es_Mayor_De_30() {

        List<Empleado> lista = Arrays.asList(
                new Empleado(50000, 25, "Sistemas"),
                new Empleado(10000, 35, "Ventas"),
                new Empleado(20000, 40, "RH")
        );

        Empleado resultado = programa.mayorSalarioMayorDe30(lista);


        assertEquals(20000.0, resultado.getSalario(), 0.001);
    }

    @Test
    public void test_de_Menor_Salario_de_la_Edad_Menos_Comun() {


        Empleado e1 = new Empleado(1000, 20, "A");
        Empleado e2 = new Empleado(1000, 20, "A");
        Empleado e3 = new Empleado(1000, 30, "A");
        Empleado e4 = new Empleado(1000, 30, "A");


        Empleado e5 = new Empleado(5000, 50, "A"); // Edad rara, salario alto
        Empleado e6 = new Empleado(2000, 60, "A"); // Edad rara, salario BAJO (GANADOR)

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4, e5, e6);

        Empleado resultado = programa.menorSalarioEdadMenosComun(lista);


        assertEquals(2000.0, resultado.getSalario(), 0.001);
        assertEquals(60, resultado.getEdad());
    }
}
