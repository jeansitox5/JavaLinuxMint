package Seccion2_Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase20_V2Optimizando {

    public static void main(String[] args) {
        //podemos solicitar datos al usuario desde la terminal con la clase Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero por favor ");
        //String numeroString = scanner.nextLine();


        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();                          //entonces la clase Scanner se encarga directamente de pedir el dato (en este caso un int), solo que ahora la excepción va a cambiar (pero esa excepción la indica la misma terminal xd)
        }catch (InputMismatchException e ){                             // ' e ' es el nombre de la variable que maneja la excepción (Creo), también podemos colocar unicamente 'Exception' que es cómo que la padre de todas las excepciones; Exception es para atrapar una excepción genérica
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
