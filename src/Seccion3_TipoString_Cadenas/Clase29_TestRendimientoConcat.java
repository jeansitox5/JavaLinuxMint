package Seccion3_TipoString_Cadenas;

public class Clase29_TestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
                /*
                StringBuilder es una clase en Java que se utiliza para crear y manipular cadenas de texto de una manera más eficiente que la clase String, especialmente cuando se realizan múltiples operaciones de concatenación o modificación de cadenas.
                Relación y Diferencias con String
                Mutabilidad:
                String: Es inmutable, lo que significa que una vez que se crea un objeto String, su valor no puede cambiar. Cualquier operación que modifique una cadena, como concatenar otra cadena, genera un nuevo objeto String.
                StringBuilder: Es mutable, lo que significa que su contenido puede modificarse sin necesidad de crear un nuevo objeto. Esto lo hace más eficiente en términos de memoria y rendimiento para operaciones repetidas de modificación de cadenas.
                 */


        long tiempoInicial = System.currentTimeMillis();       //Aquí empieza a medir el tiempo ......... método de la clase System que devuelve una medida de tiempo de ejecución de un programa (se utiliza para medir el tiempo de ejecución).

        for (int i = 0; i < 500 ; i++){
            //c = c.concat(a).concat(b).concat("\n");               // 500 => 3ms     se tardó 3 ms en realizar las 500 iteraciones con el método .concat();
            //c = c + a + b + "\n";                                 // 500 => 21.2 ms  en promedio con al concatenar con (+)
            sb.append(a).append(b).append("\n");                    // 500 => 0 ms, este StringBuilder y su método .append() para concatenar es el más rápido para concatenar Strings
        }

        long tiempoFin = System.currentTimeMillis();            //Aquí finaliza la medición del tiempo

        long fin = (tiempoFin - tiempoInicial);
        System.out.println("Tiempo de ejecución:    " + fin);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
