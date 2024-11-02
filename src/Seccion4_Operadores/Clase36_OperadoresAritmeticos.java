package Seccion4_Operadores;

import javax.swing.*;

public class Clase36_OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;     // se pueden declarar variables en una misma linea, media vez sean del mismo tipo

        // suma
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        // Resta
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        // Multiplicación
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        // División
        int div = i / j;
        double div2 = (double) i / (double)j ;          // casteo para transformar de int a double
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        // Módulo o resto
        int modulo = i % j;
        System.out.println("modulo = " + modulo);

        int resto = 8 % 5;
        System.out.println("resto = " + resto);

            // Programa para verificar si un número es par o impar

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número por favor"));  // convertimos de String a int, y pedimos datos a través de una ventada de diálogo (java Swing)
        System.out.println("numero = " + numero);


        if (numero % 2 == 0) {
            System.out.println("El número que ingresaste es PAR" + " " + numero);
//            JOptionPane.showMessageDialog(null, "El número que ingresaste es PAR");
        } else
            System.out.println("El número que ingresaste es IMPAR" + " " + numero);
        }
    }

