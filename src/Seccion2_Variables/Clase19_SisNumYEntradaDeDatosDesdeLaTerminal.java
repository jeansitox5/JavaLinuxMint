package Seccion2_Variables;

//SISTEMAS NUMÉRICOS Y ENTRADAS DE DATOS DESDE LA TERMINAL

import javax.swing.*;

public class Clase19_SisNumYEntradaDeDatosDesdeLaTerminal {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un número entero por favor");           //JOptioPane. solicita un valor tipo String
        int numeroDecimal = Integer.parseInt(numeroString);                     //convertir un tipo String a un entero
        System.out.println("numeroDecimal = " + numeroDecimal);



        //Decimal a Binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //Decimal a Octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //Decimal a Hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += System.lineSeparator() + "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);       //mensaje +=   es igual que: mensaje = mensaje +
        mensaje += System.lineSeparator() + "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null,mensaje);


    }
}
