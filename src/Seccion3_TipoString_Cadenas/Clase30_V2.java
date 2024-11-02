package Seccion3_TipoString_Cadenas;

public class Clase30_V2 {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;         //null indica que la variable aún no tiene un valor asignado o que no hay un valor válido disponble

        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = ""; //Programación en Java
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();     //.isEmpty() verifica si la variable que se evalúa esta vacia (no tiene nignun caracter), no es lo mismo que null, null directamente dice que ahi no existe nada
        System.out.println("esVacio2 = " + esVacio2);

        if (curso.isEmpty() == true){      // !(curso.Empty()); porque el if solo ejecuta el código si la condición es verdadera
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));

        }

    }
}
