package Seccion3_TipoString_Cadenas;

import java.util.Scanner;

public class Tarea3_EjemploInstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length() - 2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length() - 2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length() - 2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }

    //Ejemplo fumado para mi:

    /*
    public static void main(String[] args) {

        String[] names = new String[3];
        Scanner keyboardInput = new Scanner(System.in);
        String newName = "";

        for (int i =0; i < 3; i++){
            System.out.println("Ingresa el nombre: " + (i+1));
            String name = keyboardInput.nextLine();

            String initialLetter = name.substring(1,2).toUpperCase();
            String finalLetters = name.substring( name.length() - 2);

            newName += initialLetter + "."+ finalLetters + "_";
        }

        System.out.println(newName.substring(0, newName.length() - 1));

    }

     */
    
}
