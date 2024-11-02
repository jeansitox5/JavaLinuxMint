package Seccion2_Variables;

//SISTEMAS NUMÉRICOS Y ENTRADAS DE DATOS DESDE LA TERMINAL

import javax.swing.*;

public class Clase19_V2_Optimizando {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un número entero por favor");           //JOptioPane. solicita un valor tipo String

        //que pasa si en vez de un entero ingresamos caracteres, solucionémoslo con el try - catch


        int numeroDecimal = 0;                                                 //tenemos que inicializar fuera la variable para que abarque todo el contexto
       try {
           numeroDecimal = Integer.parseInt(numeroString);                     //convertir un tipo String a un entero, aquí tambíen ocurre nuestre excepción
       }catch (NumberFormatException e ){
           JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
           main(args);                  //invocamos a la clase main para iniciar otra vez el ciclo
           System.exit(0);       //usamos el método exit de la clase System para finalizar la ejecución por completo del programa y evitar que se ejecute el cóigo de abajo luego de que se retorne el main (asi evitar que el código se ejecute varias veces de manera inecesaria) ; el status 0 significa que todo salió bien
       }

        System.out.println("numeroDecimal = " + numeroDecimal);



        //Decimal a Binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //Decimal a Octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //Decimal a Hexadecimal
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


        String mensaje = resultadoBinario;
        mensaje += System.lineSeparator() + resultadoOctal;      //mensaje +=   es igual que: mensaje = mensaje +
        mensaje += System.lineSeparator() + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null,mensaje);


    }
}
