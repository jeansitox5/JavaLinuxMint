package Seccion4_Operadores;

public class Clase48_OperadorinstanceOf {

    public static void main(String[] args) {

//        String texto = new String("Creando un objeto de la clase String... HOLA!");
//        Integer number = new Integer(7);

        String texto = "Creando un objeto de la clase String... HOLA!";
        Integer number = 7;

        boolean b1 = texto instanceof String;   // texto es una instancia de String

        System.out.println("b1 = " + b1);

        b1 = texto instanceof Object;           // En java, todas las clases heredan de la clase padre Object.
        System.out.println("b1 = " + b1);

        b1 = number instanceof Integer;          // Integer es la clase envoltura Wrapper de int
        System.out.println("b1 = " + b1);

        b1 = number instanceof Number;             // Number es la clase padre de los wrapper de enteros.
        System.out.println("b1 = " + b1);

        b1 = number instanceof Object;
        System.out.println("b1 = " + b1);



        // Verificación del commit
        








    }
}
