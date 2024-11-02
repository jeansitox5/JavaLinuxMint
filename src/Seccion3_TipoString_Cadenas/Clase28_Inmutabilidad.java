package Seccion3_TipoString_Cadenas;
public class Clase28_Inmutabilidad {
    public static void main(String[] args) {
        /*
        Inmutabilidad del String: una de las características que tiene el String que su valor
        es inmutable, es decir que no cambia, una vez que se crea el objeto su valor se mantiene inalterable,
        cuando cambiamos el valor, lo que sucede es que se crea un nuevo objeto y se guarda en esa variable.
         */

        String curso = "Programación en Java";
        String profesor = " Andrés Guzmán";

        curso.concat(profesor); //el concat retorna una nueva instancia, un nuevo objeto, no altera a curso
        System.out.println("curso = " + curso);
        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //veamos como podemos modificar el valor de curso (no cambiar el original), más bien crear una nueva instancia a partir del mismo

        String resultado2 = curso.transform((c) -> {
            return c + " con " + profesor;                  //retorna el valor de curso con un cambio añadido
        });
        System.out.println("curso = " + curso);  //veremos que el valor del string original no ha cambiado, porque es inmutable.
        System.out.println("resultado2 = " + resultado2);   //este ya es un nuevo objeto, una 'modificación' de el objeto curso.

        //veamos otro ejemplo de inmutabilidad

        resultado.replace("a" , "A");    //no cambiará nada de resultado porque un String es inmutable, pero implícitamente ya se ha creado otra instancia con los cambios que acabamos de hacer
        String resultado3 = resultado.replace("a" , "A");
        System.out.println("resultado3 = " + resultado3);   //aquí ya se creó una modificación de la clase resultado (una nueva instancia llamada resultado3), con los cambios aplicados con el método: .replace();


    }
}
