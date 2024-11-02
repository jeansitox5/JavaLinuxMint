package Seccion2_Variables;

import javax.swing.*;
import java.util.Scanner;

public class Clase20_SistemasNumYEntradasDeDatosDesdeElTerminal {

    public static void main(String[] args) {
        //podemos solicitar datos al usuario desde la terminal con la clase Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero por favor ");
        String numeroString = scanner.nextLine();


        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e ){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);


        //Decimal a Binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        //Decimal a Octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        //Decimal a Hexadecimal
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);



        String mensaje = resultadoBinario;
        mensaje += System.lineSeparator() + resultadoOctal;      //mensaje +=   es igual que: mensaje = mensaje +
        mensaje += System.lineSeparator() + resultadoHexadecimal;   //en vez de System.lineSeparator(), también se puede con \n (salto de linea)

        System.out.println(mensaje);


    }
}
