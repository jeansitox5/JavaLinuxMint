package Seccion2_Variables;

public class Clase17_PrimitivoBooleanOLogicoBinario {
    public static void main(String[] args) {

        //los tipos lógicos nos sirven para controlar flujos de control if, while, for, para evaluar una condición, etc, a través de operadores relacionales (>, < , ==, !=, etc)

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3d;    // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f;        // 123.45
        System.out.println("f = " + f);

        datoLogico = d  > f ;                   //será false porque la condición que se indica es falsa

        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogico2 = d < f ;           //será true porque la condición que se indica es verdadera

        System.out.println("datoLogico2 = " + datoLogico2);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
        
        boolean esIgual2 = 3-3 == 1;
        System.out.println("esIgual2 = " + esIgual2);



    }
}
