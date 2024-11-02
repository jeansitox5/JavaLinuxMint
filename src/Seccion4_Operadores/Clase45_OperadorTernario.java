package Seccion4_Operadores;

public class Clase45_OperadorTernario {
    public static void main(String[] args) {

        /*
        Estructura del operador ternario

        variable = condición (condición booleana) ? si es verdadero (true) : si es falso (false)
         */

        String variable = 7 == 7 ? "Si es igual a..." : "No es igual a...";
        System.out.println("variable = " + variable);


        String estado = "";
        double promedio = 5.8d;

        estado = promedio >= 6.1 ? "Estudiante Aprobado" : "Estudiante Reprobado";
        System.out.println("estado = " + estado);

        /*
        estado = promedio >= 6.1 ? "Estudiante Aprobado" : "Estudiante Reprobado";
        Equivalente a:

                if (promedio >= 6.1) {
            estado = "Estudiante Aprobado";
        } else {
            estado = "Estudiante Reprobado";
        }

         */











    }
}
