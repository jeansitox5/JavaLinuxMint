package Seccion4_Operadores;

import java.util.Scanner;

public class Clase45_OperadorTernarioV2 {
    public static void main(String[] args) {

        String estado = "";
        double promedio = 0.0;

        double mathematics = 0.0;
        double science = 0.0;
        double history = 0.0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0");
        mathematics = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencia entre 2.0 - 7.0");
        science = sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0");
        history = sc.nextDouble();


        promedio = (mathematics + science + history) / 3;
        System.out.println("promedio = " + promedio);
        System.out.println("promedio = " + String.format("%.4f",promedio));     // String.format() : para limitar la cantidad de decimales de un double (devuelve el resultado en una variable tipo String) si se desean hacer nuevos cálculos se puede convertir el dato nuevamente a un double con un caste(Double.parseDouble)



        estado = promedio >= 5.0 ? "Estudiante APROBADO": "Estudiante REPROBADO";
        System.out.println("estado = " + estado);







    }
}
