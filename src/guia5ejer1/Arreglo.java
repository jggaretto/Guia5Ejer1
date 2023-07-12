
package guia5ejer1;

public class Arreglo {
    // Método para sumar y calcular el promedio de los elementos de un arreglo unidimensional
    public static void sumarLista(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        double promedio = (double) suma / arreglo.length;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }

    // Método para buscar el entero más grande en un arreglo bidimensional irregular
    public static int buscarMayor(int[][] arreglo) {
        int mayor = Integer.MIN_VALUE;
        for (int[] fila : arreglo) {
            for (int num : fila) {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
        return mayor;
    }

    // Método para contar la cantidad de vocales en un String
    public static int cuentaVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.contains(String.valueOf(c))) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar la cantidad de veces que se repite un carácter en un String
    public static int cuentaCaracter(String cadena, char caracter) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == caracter) {
                contador++;
            }
        }
        return contador;
    }
}