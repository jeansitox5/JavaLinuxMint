package Seccion3_TipoString_Cadenas;

public class Clase30_ValidarUnString {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;         //null indica que la variable aún no tiene un valor asignado o que no hay un valor válido disponble

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programación en java";         //aqui curso ya no es nullo, ahora ya tiene un valor.
            System.out.println(curso.toUpperCase());        //NullPointerException, porque curso no tiene ningún valor
        }

        //System.out.println(curso.concat("Desde Cero!"));    //NullPointerException
        System.out.println("Bienvenido al curso " + null);  //el método concat solo lo vamos a utilizar cuando el string a utilizar no es nulo
        System.out.println("Bienvenido al curso ".concat(" ").concat(curso));
        int tamañoString = curso.length();
        System.out.println("tamañoString = " + tamañoString);

    }
}
