package Seccion2_Variables;

public class Clase18_SistemasNumericos {
    public static void main(String[] args) {

        //Sistema decimal : el 0 al 9

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);


        //Entero a binario    (binario es el sistema que entiende nuestro computador)

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));       //usamos un método de la clase integer

        int numeroBinario = 0b111110100;        //0b para indicar al compilador de java que corresponde a un número entero binario
        System.out.println("numeroBinario = " + numeroBinario);

        //Entero a octal

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764;                  // 0 para indicar al compilador que se trata de un número entero octal
        System.out.println("numeroOctal = " + numeroOctal);

        //Entero a hexadecimal

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHexadecimal = 0x1f4;          // 0x para indicar al compilador que se trata de un número entero hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);









    }
}
