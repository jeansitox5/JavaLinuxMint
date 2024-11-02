package Seccion3_TipoString_Cadenas;

public class Case26 {
    public static void main(String[] args) {

        String curso = "Programación en java";                      //String de manera implícita
        String curso2 = new String("Programación en java");  //String de manera explícita, instanciandolo
        String curso3 = "proGramacióN en JavA";

        boolean esIgual = curso == curso2; //dará false porque en java todos los objetos son únicos ( con == solo se compara el objeto más no su valor)
        System.out.println("curso == curso2: " + esIgual);

        esIgual = curso.equals(curso2);     //con el método equals no se compara la referencia de memoria del objeto si no que el valor del objeto
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso3);       //cómo su propio nombre lo dice, ignora si son mayúsculas o minúsculas
        System.out.println("curso.equalsIgnoreCase(curso3) = " + esIgual);

        //en java hay una particularidad:

        String curso4 = "Programación en java";
        esIgual = curso == curso4;          //es true porque anteriormente ya existia un objeto con el mismo valor, son iguales porque ambas fueron declaradas por la literal (implícitamente)
        System.out.println("curso == curso4 : " + esIgual);     //







    }
}
