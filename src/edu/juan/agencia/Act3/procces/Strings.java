package edu.juan.agencia.Act3.procces;

/**
 * Utilidades para operaciones simples sobre cadenas de texto.
 *
 * <p>Proporciona métodos para verificar si un texto es palíndromo
 * y para contar las vocales en una cadena.</p>
 */
public class Strings {

    /**
     * Comprueba si el texto proporcionado es un palíndromo.
     *
     * <p>Un palíndromo es una cadena que se lee igual de izquierda a derecha
     * que de derecha a izquierda. La comprobación es sensible a mayúsculas,
     * minúsculas y espacios (no se normaliza ni elimina acentos).</p>
     *
     * @param texto la cadena a evaluar; puede ser {@code null}
     * @return {@code true} si {@code texto} no es {@code null} y es palíndromo;
     *         {@code false} si {@code texto} es {@code null} o no es palíndromo
     */
    public boolean Palindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String invertida = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertida);
    }

    /**
     * Cuenta las vocales presentes en la cadena.
     *
     * <p>Cuenta las vocales básicas {@code a, e, i, o, u} en mayúsculas y minúsculas.
     * No considera caracteres acentuados como vocales distintas (por ejemplo, {@code 'á'} no se cuenta).</p>
     *
     * @param texto la cadena en la que se cuentan las vocales; puede ser {@code null}
     * @return el número de vocales encontradas, o {@code 0} si {@code texto} es {@code null}
     */
    /**
         * Cuenta las vocales presentes en la cadena.
         *
         * <p>Cuenta las vocales básicas {@code a, e, i, o, u} en mayúsculas y minúsculas.
         * No considera caracteres acentuados como vocales distintas (por ejemplo, {@code 'á'} no se cuenta).</p>
         *
         * @param texto la cadena en la que se cuentan las vocales; puede ser {@code null}
         * @return el número de vocales encontradas, o {@code 0} si {@code texto} es {@code null}
         */
        public int contarVocales(String texto) {
            if (texto == null) {
                return 0;
            }
            int contador = 0;
            String vocales = "aeiouAEIOU";

            for (char c : texto.toCharArray()) {

                if (vocales.indexOf(c) != -1) {
                    contador++;
                }
            }
            return contador;
        }

        /**
         * Invierte una cadena de texto manualmente sin usar {@code StringBuilder.reverse()}.
         *
         * <p>Si {@code texto} es {@code null}, retorna {@code null}.</p>
         *
         * @param texto la cadena a invertir; puede ser {@code null}
         * @return la cadena invertida, o {@code null} si {@code texto} es {@code null}
         */
        public String invertirCadenaManual(String texto) {
            if (texto == null) return null;

            String resultado = "";

            for (int i = texto.length() - 1; i >= 0; i--) {
                resultado += texto.charAt(i);
            }
            return resultado;
        }

        /**
         * Busca la primera ubicación de un carácter en una cadena manualmente sin usar {@code indexOf}.
         *
         * <p>Si {@code texto} es {@code null}, retorna {@code -1}.</p>
         *
         * @param texto la cadena en la que se busca el carácter; puede ser {@code null}
         * @param objetivo el carácter a buscar
         * @return la posición del primer carácter encontrado, o {@code -1} si no se encuentra o {@code texto} es {@code null}
         */
        public int buscarCaracterManual(String texto, char objetivo) {
            if (texto == null) return -1;


            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == objetivo) {
                    return i;
                }
            }
            return -1;
        }
}
