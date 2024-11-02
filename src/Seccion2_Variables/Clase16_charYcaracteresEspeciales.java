package Seccion2_Variables;

public class Clase16_charYcaracteresEspeciales {
    public static void main(String[] args) {

        //Espacio

        char espacio = ' ';
        char espacioUnicode = '\u0020';

        //Retroceso : retrocede un espacio y elimina el caracter que se encontraba en esa posición

        char retroceso = '\b';

        //Tabulador

        char tabulador = '\t';

        //Nueva Linea   : hace un salto e linea (baja una linea)

        char nuevaLinea = '\n';

        //Retorno Carro  : hace un salto de linea y limpia todo lo anterior a el

        char retornoCarro = '\r';



        System.out.println("char corresponde en byte a:" + espacio + Character.BYTES);
        System.out.println("char corresponde en bits a:" + retroceso + Character.SIZE);
        System.out.println("valor máximo de un\tchar:" + tabulador + tabulador + Character.MAX_VALUE);
        System.out.println("valor mínimo de un char : " + nuevaLinea + Character.MIN_VALUE);

        System.out.println("char corresponde en byte a: " + retornoCarro + Character.BYTES);

        System.out.println("El retorno carro va a limpiar todo esto \r y esto es lo que va a quedar");


        //para hacer una combinacion de el salto de linea y el retorno carro (porque funcionan diferente en cada sistema operativo, podemos usar el siguiente método de la clase system)

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + System.lineSeparator() + "bbbbbbbbbbbbbbbbbbbbbbbb");



    }
}
