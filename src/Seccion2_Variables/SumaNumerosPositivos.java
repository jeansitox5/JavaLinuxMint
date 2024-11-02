package Seccion2_Variables;

import java.util.Scanner;

public class SumaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaTotal = 0;
        int numero;

        System.out.println("Ingresa números positivos (ingresa un número no positivo para terminar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                sumaTotal += numero;
            }
        } while (numero > 0);

        System.out.println("La suma de los números positivos ingresados es: " + sumaTotal);
    }
}
