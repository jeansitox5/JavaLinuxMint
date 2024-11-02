package Seccion3_TipoString_Cadenas;

import java.util.Scanner;

public class Tarea3ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, por favor ingrese el nombre de un familiar o amigo: ");
        String nombre1 = sc.nextLine();

        // Para la parte del segundo Carácter:
        String cortadaDelNombre1Upper = nombre1.substring(1,2).toUpperCase();
        System.out.println("nombre1 = " + nombre1);
        System.out.println("cortadaDelNombre1Upper = " + cortadaDelNombre1Upper);

        // Para la parte de concatenación del punto y los dos últimos caracteres
        int largoNombre1 = nombre1.length();
        System.out.println("largoNombre1 = " + largoNombre1);
        String dosUltimosCaracteres = nombre1.substring(largoNombre1 - 2 );         // otra forma más compacta 
        System.out.println("dosUltimosCaracteres = " + dosUltimosCaracteres);
         String dosUltimosCaracteresYPunto = "." + dosUltimosCaracteres;
        System.out.println("dosUltimosCaracteres = " + dosUltimosCaracteresYPunto);
        
        // Concatenando las dos últimas el segundo carácter mayuscula con los dos ultimos caracteres y el punto
        String nombre1Final = cortadaDelNombre1Upper + dosUltimosCaracteresYPunto;
        System.out.println("nombre1Final = " + nombre1Final);






    }
}
