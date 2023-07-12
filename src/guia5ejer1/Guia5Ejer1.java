/*
En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
estáticos (static):

a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.

b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.

d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.

Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
de la clase Arreglo creada por usted.
 */
package guia5ejer1;

public class Guia5Ejer1 {

   
    public static void main(String[] args) {
        // Ejemplo de uso de los métodos de la clase Arreglo
        int[] arreglo1 = {1, 2, 3, 4, 5};
        Arreglo.sumarLista(arreglo1);

        int[][] arreglo2 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int mayor = Arreglo.buscarMayor(arreglo2);
        System.out.println("El entero más grande es: " + mayor);

        String cadena = "Hola mundo";
        int cantidadVocales = Arreglo.cuentaVocales(cadena);
        System.out.println("La cantidad de vocales en la cadena es: " + cantidadVocales);

        String cadena2 = "Hola mundo";
        char caracter = 'o';
        int cantidadCaracter = Arreglo.cuentaCaracter(cadena2, caracter);
        System.out.println("El carácter '" + caracter + "' se repite " + cantidadCaracter + " veces en la cadena.");
    }
}
