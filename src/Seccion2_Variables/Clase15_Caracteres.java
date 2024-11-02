package Seccion2_Variables;

import java.sql.SQLOutput;

public class Clase15_Caracteres {

    public static void main(String[] args) {

        //Primitivo char o caracter
        /*
        -se delcaran con comillas simples ''
        -Un String es una cadena de caracteres (son varios caracteres juntitos
        -Los caracteres de java estan basados en el estandar de codificacion unicode
         */


        char caracter = 'a';
        System.out.println("caracter = " + caracter);


        char caracterNumeral = '\u0023';
        System.out.println("caracterNumeral = " + caracterNumeral);

        char caracterArroba = '\u0040';                 //representado en forma unicode
        System.out.println("caracterArroba = " + caracterArroba);

        char decimalArroba = 64;                              //representado en forma decimal
        System.out.println("decimal = " + decimalArroba);

        System.out.println("decimal = caracterArroba: " + (decimalArroba == caracterArroba) );

        char simboloArroba = '@';
        System.out.println("simboloArroba = " + simboloArroba);

        System.out.println("simboloArroba = caracterArroba = " + (simboloArroba == caracterArroba));

        //¿que pasa con var?
            /*
            Toma el valor automáticamente según de le asigne
             */

        var arrobaUnicode = '\u0040';
        System.out.println("arrobaUnicode = " + arrobaUnicode);


        System.out.println("--------------------------CLASE PARA CHAR---------------------------------");

        System.out.println("char corresponde en byte a : " + Character.BYTES);
        System.out.println("char corresponde en bits a : " + Character.SIZE);
        System.out.println("valor máximo de un char : " + Character.MAX_VALUE);         //Es un carácter especial
        System.out.println("valor mínimo de un char : " + Character.MIN_VALUE);         //Es un espacio en blanco xd





    }
}
