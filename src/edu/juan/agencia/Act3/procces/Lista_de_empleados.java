package edu.juan.agencia.Act3.procces;

import edu.juan.agencia.Act3.modelos.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Utilidades para operar sobre listas de {@link Empleado}.
 *
 * <p>Proporciona métodos para obtener el empleado con mayor salario,
 * calcular estadísticas de edad y salario, y filtrar o contar empleados
 * según condiciones específicas.</p>
 */
public class Lista_de_empleados {

    /**
     * Devuelve el empleado con mayor salario en la lista.
     *
     * <p>Si {@code lista} es {@code null} o está vacía retorna {@code null}.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null} o vacía
     * @return el {@link Empleado} con mayor salario, o {@code null} si la lista es {@code null} o vacía
     */
    public Empleado mayorsalario(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        Empleado mayor = lista.get(0);

        for (Empleado e : lista) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        return mayor;
    }

    /**
     * Calcula la edad más común (moda) entre los empleados.
     *
     * <p>Si {@code lista} es {@code null} o está vacía retorna {@code -1} como indicador de error.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null} o vacía
     * @return la edad más repetida, o {@code -1} si la lista es {@code null} o vacía
     */
    public int edadcomun(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) {
            return -1;
        }

        Map<Integer, Integer> frecuencias = new HashMap<>();

        for (Empleado e : lista) {
            int edad = e.getEdad();
            if (frecuencias.containsKey(edad)) {
                frecuencias.put(edad, frecuencias.get(edad) + 1);
            } else {
                frecuencias.put(edad, 1);
            }
        }

        int edadGanadora = -1;
        int maxRepeticiones = 0;

        for (Map.Entry<Integer, Integer> par : frecuencias.entrySet()) {
            if (par.getValue() > maxRepeticiones) {
                maxRepeticiones = par.getValue();
                edadGanadora = par.getKey();
            }
        }
        return edadGanadora;
    }

    /**
     * Calcula el promedio de edad de los empleados.
     *
     * <p>Si {@code lista} es {@code null} o está vacía retorna {@code 0.0}.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null} o vacía
     * @return el promedio de edad, o {@code 0.0} si la lista es {@code null} o vacía
     */
    public double promedioedad(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        int suma = 0;
        for (Empleado e : lista) {
            suma += e.getEdad();
        }
        return (double) suma / lista.size();
    }

    /**
     * Calcula el promedio de salario de los empleados.
     *
     * <p>Si {@code lista} es {@code null} o está vacía retorna {@code 0.0}.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null} o vacía
     * @return el promedio de salario, o {@code 0.0} si la lista es {@code null} o vacía
     */
    public double promediosalario(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (Empleado e : lista) {
            suma += e.getSalario();
        }
        return suma / lista.size();
    }

    /**
     * Calcula el promedio de edad de los empleados cuyo salario es mayor a 25\,000.
     *
     * <p>Si {@code lista} es {@code null} o está vacía retorna {@code 0.0}.
     * Si no hay empleados con salario mayor a 25\,000 retorna {@code 0.0}.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null} o vacía
     * @return el promedio de edad de los empleados con salario > 25\,000, o {@code 0.0} si no hay ninguno
     */
    public double edadconsalariomayor25(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        int sumaEdad = 0;
        int contador = 0;

        for (Empleado e : lista) {
            if (e.getSalario() > 25000) {
                sumaEdad += e.getEdad();
                contador++;
            }
        }

        if (contador == 0) return 0.0; // Evitar división por cero
        return (double) sumaEdad / contador;
    }

    /**
     * Devuelve una lista con los empleados menores de 25 años.
     *
     * <p>Si {@code lista} es {@code null} retorna una lista vacía.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null}
     * @return una nueva lista con los empleados cuya edad es menor a 25
     */
    public List<Empleado> menor25(List<Empleado> lista) {
        List<Empleado> resultado = new ArrayList<>();
        if (lista == null) return resultado;

        for (Empleado e : lista) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    /**
     * Cuenta cuántos empleados pertenecen al departamento \"Sistemas\".
     *
     * <p>La comparación es insensible a mayúsculas/minúsculas.
     * Si {@code lista} es {@code null} retorna {@code 0}.</p>
     *
     * @param lista la lista de empleados; puede ser {@code null}
     * @return el número de empleados en el departamento \"Sistemas\"
     */
    public int empleadosdesistemas(List<Empleado> lista) {
        if (lista == null) return 0;
        int contador = 0;

        for (Empleado e : lista) {
            if ("Sistemas".equalsIgnoreCase(e.getDepartamento())) {
                contador++;
            }
        }
        return contador;
    }

    /**
             * Encuentra el empleado con el mayor salario entre aquellos cuya edad es mayor a 30 años.
             *
             * <p>Si {@code lista} es {@code null} o está vacía, retorna {@code null}.
             * Si no hay empleados mayores de 30 años, también retorna {@code null}.</p>
             *
             * @param lista la lista de empleados; puede ser {@code null} o vacía
             * @return el {@link Empleado} con el mayor salario entre los mayores de 30 años,
             *         o {@code null} si no hay empleados que cumplan la condición
             */
            public Empleado mayorSalarioMayorDe30(List<Empleado> lista) {
                if (lista == null || lista.isEmpty()) return null;

                Empleado mejorCandidato = null;

                for (Empleado e : lista) {
                    if (e.getEdad() > 30) {

                        if (mejorCandidato == null || e.getSalario() > mejorCandidato.getSalario()) {
                            mejorCandidato = e;
                        }
                    }
                }
                return mejorCandidato;
            }

            /**
             * Encuentra el empleado con el menor salario entre aquellos cuya edad es la menos común.
             *
             * <p>Si {@code lista} es {@code null} o está vacía, retorna {@code null}.
             * Si hay múltiples empleados con la edad menos común, selecciona el de menor salario.</p>
             *
             * @param lista la lista de empleados; puede ser {@code null} o vacía
             * @return el {@link Empleado} con el menor salario entre los empleados con la edad menos común,
             *         o {@code null} si no hay empleados en la lista
             */
            public Empleado menorSalarioEdadMenosComun(List<Empleado> lista) {
                if (lista == null || lista.isEmpty()) return null;

                Map<Integer, Integer> frecuencias = new HashMap<>();
                for (Empleado e : lista) {
                    frecuencias.put(e.getEdad(), frecuencias.getOrDefault(e.getEdad(), 0) + 1);
                }

                int frecuenciaMinima = Integer.MAX_VALUE;
                for (int cantidad : frecuencias.values()) {
                    if (cantidad < frecuenciaMinima) {
                        frecuenciaMinima = cantidad;
                    }
                }

                Empleado elegido = null;

                for (Empleado e : lista) {

                    if (frecuencias.get(e.getEdad()) == frecuenciaMinima) {

                        if (elegido == null || e.getSalario() < elegido.getSalario()) {
                            elegido = e;
                        }
                    }
                }
                return elegido;
            }
}
