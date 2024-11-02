package Seccion3_TipoString_Cadenas;

public class Clase30_V3 {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;         //null indica que la variable aún no tiene un valor asignado o que no hay un valor válido disponble

        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = " "; //ahora ya no es un espacio vacio, ya tiene un caracter espacio
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();         //c.isBlank(); retorna true si el String es vacio, es Empty o si tiene espacios en blanco
        System.out.println("esBlanco = " + esBlanco);


        if (esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));

        }

                /*
                .isBlank();
                .isEmpty();
                null;
                    son las formas para validar si un String tiene contenido, entre ellas .isBlank es la más estricta de todas ellas.
                 */

    }
}
