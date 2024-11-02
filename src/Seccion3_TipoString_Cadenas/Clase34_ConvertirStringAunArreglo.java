package Seccion3_TipoString_Cadenas;

import java.util.Arrays;

public class Clase34_ConvertirStringAunArreglo {
    public static void main(String[] args) {
        // Algunos métodos útiles para convertir un String a un arreglo

        System.out.println("*** Método .toCharArray *** ");

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //[C@7291c18f es la representación de la referencia en memoria del arreglo, no su contenido. (C indica que se trata de un arreglo de caracteres y @729... es el identificador hexadecimal)

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;     // length aquí no es método es un atributo
        System.out.println("largo = " + largo);

        // creamos un ciclo for para recorrer el arreglo y poder imprimirlo (porque si tratamos de imprimirlo directamonte con un println solo nos dará la dirección de referencia de memoria)

        for(int i = 0; i < largo; i = i + 1 ) {             // en donde largo es 12
           System.out.print(arreglo[i] + " ");      // imprime el contenido de arreglo pero con el incremento de i     ; sin salto de linea porque es solo print no println
        }

        System.out.println();
        System.out.println("*** Método .split() *** ");

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));   // también imprime la dirección de referencia de memoria
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        System.out.println("largo2 = " + largo2);

            //recorremos arreglo 2 para imprimirlo con un ciclo for

        for(int j = 0; j < largo2; j ++) {
            System.out.println(arreglo2[j]);
        }


        // Con el ejemplo para obtener la extensión de un archivo:

        String archivo = "Base_de_precios.xlsx";
        String[] archivoArray = archivo.split("\\."); // [.]  debemos colocar el punto así porque el punto es una expresión regular (un tema amplio aparte), aquí el punto es el delimitador
        largo = archivoArray.length;
        System.out.println("largo = " + largo);

//        for(int k = 0; k < largo; k++) {
//            System.out.println(archivoArray[k]);
//        }

        System.out.println(Arrays.toString(archivoArray));      // esto lo investigué extra por mi parte, con  la librería array para imprimir arreglos sin la necesidad de hacer bucles

        // o podemos obtener la extensión del archivo simplemente usando antes el método split (con el delimitador como punto) , conociendo el largo e imprimiendo de la siguiente manera:

        System.out.println("extension = " + archivoArray[largo - 1]);       // pero para esta línea no es necesario el bucle for xd solo el .split()




        










//       System.out.println(Arrays.toString(arreglo));







//        for (char c : arreglo) {
//            System.out.println(c);
//        }



    }
}
