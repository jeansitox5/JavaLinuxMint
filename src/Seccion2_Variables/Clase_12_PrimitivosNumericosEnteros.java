package Seccion2_Variables;

public class Clase_12_PrimitivosNumericosEnteros {
    public static void main(String[] args) {

        //PRIMITIVOS NUMÉRICOS ENTEROS

            //Byte  entre -128 a 127
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);           //Byte es una clase y .BYTES, .SIZE, .MAX_VALUE, .MIN_VALUE; són metodos de la clase (solo para datos de referencia, no para primitivos)
        System.out.println("Tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);
                //Byte es la clase que engloba byte

            //Short  entre -32768 a 32767
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);
                //Short es la clase que engloba a short

            //Int   entre 2147483647 a -2147483648
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);
                //Integer es la clase que engloba a int

            //Long      entre -9223372036854775808 a 9223372036854775807
        long numeroLong = 9223372036854775807L;              //se le debe agregar una L para saber que es un tipo long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor máximo de un int: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Long.MIN_VALUE);
                //Long es la clase que engloba long

        //¿qué pasa con la variable dinámica VAR?

        var numeroVar = 127;                        //por defecto siempre será un int, si pasa su limite (el del int) debemos indicar que es un long con la L o un float con la F (lo de float lo veremos después)










    }
}
