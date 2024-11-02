package Seccion3_TipoString_Cadenas;
public class Clase27 {
    public static void main(String[] args) {
        //concatenación con el signo +
        String curso = "Programación en Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);          // no suma aritméticamente, solo concatena todo como un string
        System.out.println(detalle + (numeroA + numeroB));       //ahora si lo hace bien por la precedencia de operadores
        System.out.println((numeroA+numeroB) + detalle);        //importante tomar en cuenta la precedencia de operadores

        //concatenación con el método concat
        System.out.println("------Concatenación con el método .concat()----------");

        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        String detalle3 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle3 = " + detalle3);


                /*
                   la forma más recomendable de concatenar es con el método .concat()
                 */









    }
}
