package Seccion2_Variables;

public class Clase21_ConversionDeCadenasAPrimitivos {
    public static void main(String[] args) {

        String numeroStr = "50";

        //De String a entero
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        long numeroLong = Long.parseLong(numeroStr);
        System.out.println("numeroLong = " + numeroLong);
                //de la misma manera se puede hacer para todos los primitivos enteros

        //De String a decimal
        String realStr = "98765.45e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("numberDouble = " + realDouble);
                //de manera similar para el float


        //De String a boolean
        String logicStr = "true";                   //también aplica para TRUE O FALSE en mayúsculas, TruE, T, FalSe
        boolean logicBolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBolean = " + logicBolean);

        //También podemos tranformar de var a cualquier tipo específico

        var numberStr = "345";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

                // la variable var también es llamada variable flexible.

    }
}
