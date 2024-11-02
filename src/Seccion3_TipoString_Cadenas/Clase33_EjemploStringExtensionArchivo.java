package Seccion3_TipoString_Cadenas;

public class Clase33_EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        //puede ser cualquier extensión de cualquier archivo (jpeg, png, .doc, .pdf., .xlsx, etc)

        String archivo  = "alguna_imagen.jpeg";
        
        System.out.println("archivo.length() = " + archivo.length());           // obtenemos el tamaño de la cadena
        System.out.println("archivo.substring(14) = " + archivo.substring(14));     // obtenemos la extensión del archivo pero solo para este nombre de archivo en concreto
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));     // Pero esto no es sostenible para cualquier nombre de cualquier archivo

        //Podemos hacerlo en el método .indexOf() que retorna la posición del índice de incidencia de un carácter (en este caso nuestro carácter en común de incidencia será el punto '.')

        System.out.println("-----------Con .indexOF() ----------");
        System.out.println("archivo.indexOf(\"n\") = " + archivo.indexOf("n")); // ejemplo para recordar el método
        
        String archivo2 = "Base_de_precios.xlsx";
            //El metodo .indexOf() retorna un int
        int incidencia = archivo2.indexOf(".");
        System.out.println("incidencia = " + incidencia);
        System.out.println("archivo2.substring(incidencia) = " + archivo2.substring(incidencia));
            // pero nos retorna la extensión del archivo con todo y punto por tanto le sumamo + 1
        
        incidencia = incidencia + 1;

        System.out.println("archivo2.substring(incidencia) = " + archivo2.substring(incidencia));

            // ahora solo reemplazamos el nombre del archivo del cual queremos saber la extensión en la variable 'archivo2'
            // podemos usar tambien el método .lastIndexOf() por si el archivo tiene otros puntos en su nombre
        
        
        
        
    }
}
