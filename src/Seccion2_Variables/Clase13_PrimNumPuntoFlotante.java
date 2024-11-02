package Seccion2_Variables;

public class Clase13_PrimNumPuntoFlotante {
    public static void main(String[] args) {

        //float

        float realFloat = 2.12e3f; //2120.0f;                     se le agrega una f para indicar que es una float, también se pueden expresar en notación científica
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e4f; //15000f
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 1.5e-10f; //0.00000000015f
        System.out.println("realFloat3 = " + realFloat3);
        
        float realFloat4 = 0.00000000015f;
        System.out.println("realFloat4 = " + realFloat4);

                /* la notación científica permite escribir datos bastante grandes de manera compacta
                *lo que va a la izquierda del exponente se le conoce como mantiza (parte fraccionaria) 1.5e-10f
                * y el valor correspondiete se le conoce cómo valor de punto fijo 0.00000000015f
                * */

        System.out.println("-------------------------CLASE 14----------------------------------------");

        //Primitivos numéricos de punto flotante y sus constantes (y sus CLASES)

        float realFloat0 = 3.4028235E38f;      //entre 1.4E-45 a 3.4028235E38
        System.out.println("realFloat0 = " + realFloat0);
        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);
            //Float es la clase que engloba a float

        //para valores aún más grandes usamos el Double (el punto flotante de doble precisión)

        //Double

        double realDouble = 1.7976931348623157E308d;     //entre 4.9E-324 a 1.7976931348623157E308
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);
            //Double es la clase que engloba a double



        // ¿qué pasa con la variable Var?

        var varFlotante = 3.1416;                       //por defecto toma el valor de un double (lo explicitamos agregando una d),  o agregamos una f para que sea un float
        System.out.println("varFlotante = " + varFlotante);


            /* El valor por defecto de los Prim numéricos enteros es 0
            *  El valor por defecto de los Prim numéricos de punto flotante es 0.0
            * pero que se observen estos valores, la variable debe ser una variable de la clase (del tipo estático), veremos eso después xd */

    }
    
}
