package Seccion3_TipoString_Cadenas;

public class Case31_MetodosImportantesDelString {
    public static void main(String[] args) {
        
        String nombre = "Jeanfranco";
        
        //Para saber el largo de la cadena

        System.out.println("nombre.length() = " + nombre.length());

        //Convertir caracteres a mayúsculas y minúsculas

        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        //Cómo comparar un String con otro (a nivel de valor, no de instancia)

        System.out.println("nombre.equals(\"Jeanfranco\") = " + nombre.equals("Jeanfranco"));   //retorna true
        System.out.println("nombre.equals(\"jeanfranco\") = " + nombre.equals("jeanfranco"));   //retorna false
        System.out.println("nombre.equalsIgnoreCase(\"jeanFrAnco\") = " + nombre.equalsIgnoreCase("jeanFrAnco")); //retorna true, ignora mayusculas y minusculas

        System.out.println("nombre.compareTo(\"Jeanfranco\") = " + nombre.compareTo("Jeanfranco")); //comparación a nivel lexicográfico (basandose en la tabla unicode), si retorna 0 es que son identicos

        //Obtener un carácter en específico de un String (recordemos que un el índice de un String comienza desde cero)

        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));   //obtener e último caracter, -1 porque si no se pasa el indice, cómo el tamaño es 10, pero en indice comienza desde el 0, osea solo llegaria hasta el 9

        //Obtener un fragmento del String
        System.out.println(" nombre.substring(2) = " +  nombre.substring(2));   // .substring(desde(siseincluye) , hasta(noseincluye));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(1,5));         // imprime : eanf
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));









    }
}
