package Seccion3_TipoString_Cadenas;

public class Clase32 {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        //cambiar algun(os) caracteres del string por otros

        System.out.println("trabalenguas = " + trabalenguas.replace("a", ".")); // reemplazamos todos los caracteres a por un punto
            //recordemos que se retorna una nueva instancia, porque el String es inmutable

        System.out.println(trabalenguas);

        //Encontrar la posición en la que se encuentra un caracter o caracteres en el string

        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Retorna la primera posición que coincida con ese carácter
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //Retorna la última posición que coincida con el carácter solicitado
        System.out.println("trabalenguas.indexOf(z) = " + trabalenguas.indexOf('z')); //retorna un valor negativo porque ningun elemento coincide
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));       //a partir del índice 5

        //Validar si un string está dentro de otro string Sí o No

        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));     //true, porque lenguas si está en la variable trabalenguas

        //Validar si un String "comienza con" retorne true o false

        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));

        //Validar si un String "termina con" retorne true o false

        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));

        //Quitar espacios en blanco, tanto a la izquierda como a la derecha

        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());            //esté método es muy importante para formularios web, para tener datos más ordenados y menos ambiguos etc.
        




    }
}
