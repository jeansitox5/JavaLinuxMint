package Seccion3_TipoString_Cadenas;

import java.util.Scanner;

public class Tarea3ProgramaManejoDeNombresV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, por favor, ingrese el nombre tres familiares o amigos: ");
        String nombre1 = sc.nextLine();
        String nombre2 = sc.nextLine();
        String nombre3 = sc.nextLine();

        // Para la parte del segundo Carácter:
        String cortadaDelNombre1Upper = nombre1.substring(1,2).toUpperCase();
        String cortadaDelNombre2Upper = nombre2.substring(1,2).toUpperCase();
        String cortadaDelNombre3Upper = nombre3.substring(1,2).toUpperCase();
        // Para la parte de concatenación del punto y los dos últimos caracteres
        String dosUltimosCaracteresYPunto1 = "." + nombre1.substring(nombre1.length() - 2 );
        String dosUltimosCaracteresYPunto2 = "." + nombre2.substring(nombre2.length() - 2 );
        String dosUltimosCaracteresYPunto3 = "." + nombre3.substring(nombre3.length() - 2 );

        // Concatenando las dos últimas el segundo carácter mayuscula con los dos últimos caracteres y el punto
        String nombre1Final = cortadaDelNombre1Upper + dosUltimosCaracteresYPunto1;
        String nombre2Final = cortadaDelNombre2Upper + dosUltimosCaracteresYPunto2;
        String nombre3Final = cortadaDelNombre3Upper + dosUltimosCaracteresYPunto3;

        System.out.println("nombre1Final = " + nombre1Final);
        System.out.println("nombre2Final = " + nombre2Final);
        System.out.println("nombre3Final = " + nombre3Final);

        String nombresConGuion =    nombre1Final + '_' + nombre2Final + '_' + nombre3Final ;
        System.out.println("nombresConGuion = " + nombresConGuion);
        





    }
}
