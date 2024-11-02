package Seccion4_Operadores;

public class Clase39_OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre incremento
        int i = 1;
        int j = ++i;    // i = i + 1,     vemos que el valor de i cambia aunque no se modifique directamente, osea no le estamos asignando un valor directamente a i, lo hacemos implícitamente en función de otra variable pero en realidad se termina modificando

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        j = --i;    // i = i - 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Ahora mismo j = 4

        System.out.println("j = " + (++j));
        System.out.println("j = " + j);         // Aquí j vale 5, porque primero incrementa el valor de j y luego devuelve (pre)
        System.out.println("j = " + (j++));     // Aquí aunque realmente vale j valdrá 6, imprime 5 porque primero devuelve j y luego incrementa (post)
        System.out.println("j = " + j);         // Aquí j vale 6, porque ya se imprime el valor final de j.










    }
}
