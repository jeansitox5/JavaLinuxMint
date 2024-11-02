package Seccion4_Operadores;

public class Clase41_OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // And (y) conjunción &&    (todas las condiciones deben cumplirse para que sea true)

        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        // Not (o) disyunción ||    (al menos una condición debe cumplirse para que sea true)

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

            // Ejemplo de precedencia de los operadores

        boolean b3 = i == j && k > l || m == false;         // de izquierda a derecha para el orden de operación
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false);       // los paréntesis pueden cambiar por completo la precedencia de operadores
        System.out.println("b4 = " + b4);

        boolean b5 = (i == j && k > l) || m == false;
        System.out.println("b5 = " + b5);






    }
}
