package Seccion4_Operadores;

public class Clase37_OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2;     // i = i + 2
        System.out.println("i = " + i);

        i += 5;     // i = i + 5;
        System.out.println("i = " + i);

        j -= 4;     // j = j - 4;
        System.out.println("j = " + j);

        j *= 3;     // j = j * 3;
        System.out.println("j = " + j);

        // También podemos trabajar strings con operadores combinados (combinados: combinar de asignación con aritméticos, tal que -=, +=, /=, *=, %= )
            // Pequeño ejemplo de consulta a una base de datos sql

        String sqlString = "select * from clientes as c";       // selecciona de la tabla clientes como 'c' (buscar en todos los registros en la tabla clientes con el alias 'c')
        sqlString += " where c.nombre='Jean' ";               // Donde 'c' con el atributo nombre es igual a Jean
        sqlString += " and c.active=1";                       // y 'c' osea el cliente c está activo
        System.out.println("sqlString = " + sqlString);





    }

}
