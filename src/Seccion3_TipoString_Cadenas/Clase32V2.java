package Seccion3_TipoString_Cadenas;

public class Clase32V2 {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", ".")); // reemplaza los caracteres que sean a por un punto
        System.out.println("trabalenguas = " + trabalenguas);   // Pero no modifica el valor original porque un String es inmutable

        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));       // retorna el indice 2
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));   // retorna el indice 10
        System.out.println("trabalenguas.lastIndexOf(\"z\") = " + trabalenguas.indexOf("a"));   // retorna un valor negativo porque "z" no está en la cadena trabalenguas
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));   // indexOf acepta  tanto caracteres cómo strings

        if (trabalenguas.indexOf("z") >= 0) {
            System.out.println("z si está en la cadena trabalenguas");
        } else {
            System.out.println("z no está en la cadena trabalenguas");
        }   // esta es una buena manera de usar if para verificar si un caracter pertenece a una cadena

        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); // retorna true
        System.out.println("trabalenguas.contains(\"caballo\") = " + trabalenguas.contains("caballo")); // retorna false

        if (trabalenguas.contains("lenguas") == true) {
            System.out.println("Sí esta en la cadena trabalenguas");
        } else {
            System.out.println("no está en la cadena trabalenguas");
        }

        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); // true
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); // false

        System.out.println("trabalenguas.endsWith(\"tra\") = " + trabalenguas.endsWith("tra")); // false
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas")); // true

        // El método .trim()    muy usado para el llendo de formularios y páginas web, elimina los espacion en blanco a la izquierda y derecha del String

        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas ".trim());

        var patata = "   patata   ";
        System.out.println("patata = " + patata);
        System.out.println("patata = " + patata.trim());

        var patataSinEspacios = patata.trim();
        System.out.println("patataSinEspacios = " + patataSinEspacios);

        
        
        
        








    }
}
