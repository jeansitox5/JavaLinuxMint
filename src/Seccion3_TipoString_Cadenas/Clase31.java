package Seccion3_TipoString_Cadenas;

public class Clase31 {
    public static void main(String[] args) {
        String nombre = "Jeanfranco";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Jeanfranco\") = " + nombre.equals("Jeanfranco"));
        System.out.println("nombre.equals(\"jeanfranco\") = " + nombre.equals("jeanfranco"));
        System.out.println("nombre.equalsIgnoreCase(\"jeanfranco\") = " + nombre.equalsIgnoreCase("jeanfranco"));
        System.out.println("nombre.compareTo(\"Jeanfranco\") = " + nombre.compareTo("Jeanfranco")); // comparación a nivel lexicográfico(de acuerdo a la tabla unicode), retorna cero si ambos valores son iguales
        System.out.println("nombre.compareTo(\"Jeremías\") = " + nombre.compareTo("Jeremías"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(9) = " + nombre.charAt(9));
        //System.out.println("nombre.charAt(nombre.length()) = " + nombre.charAt(nombre.length()));     length = 10, pero solo hay llega hasta el índice 9
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));   // obtener siempre el último caracter de un String

        // Obtener una cierta parte de la cadena (una subcadena)
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        var subs = nombre.substring(4);
        System.out.println("subs.toUpperCase() = " + subs.toUpperCase());
        System.out.println("nombre.substring(1,7) = " + nombre.substring(1,7));     //.substring(inclusive, no inclusive);  [)
        System.out.println("nombre.substring(7,10) = " + nombre.substring(7,10));   // aunque el índice 10 no existe es válido porque no está incluido en el intervalo
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1)); // obtener siempre el último carácter de manera dínámica
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        


        
    }
}
