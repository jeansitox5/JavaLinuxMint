package Seccion2_Variables;

public class Clase22_TipoPrimitivosACadenas {
    public static void main(String[] args) {

        int numberInt = 100;
        System.out.println("numberInt = " + numberInt);

        String otherNumberStr = Integer.toString(numberInt);
        System.out.println("otherNumberStr = " + otherNumberStr);

        //otra forma de pasar de primitivo a String (cadena de caracteres)

        double numberDouble = 14.5;

        System.out.println("numberDouble = " + numberDouble);

        otherNumberStr = String.valueOf(numberInt);

        String otherNumberStr2 = String.valueOf(numberDouble);

        System.out.println("otherNumberStr2 = " + otherNumberStr2);

                //sobrecarga de método: mismo nombre de método pero con distinto argumento
                //cuando son String concatena, cuando son int los suma

        System.out.println(otherNumberStr + 10);            //CONCATENA porque uno es un string
        System.out.println(numberInt + 10 );                //SUMA porque ambos son enteros
        
        //de Double a String
        double otroRealDouble = 87.56e3;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroDoubleStr = " + otroRealStr);

        otroRealStr  = String.valueOf(1.23456f);        //conversión de un float a un String
        System.out.println("otroRealStr = " + otroRealStr);

        //
        
        int numero = 10;
        
        String numeroString = String.valueOf(numero);
        System.out.println("numeroString = " + numeroString);

    }
}
