package Seccion4_Operadores;

public class Clas40_OperadoresRelacionales {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;       // ! : negación (es cómo el operador unario '-' pero para valores booleanos)
        System.out.println("b2 = " + b2);

        boolean b3 = i != j;    // != : distinto de ( <> en otros lenguajes de programación)
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

        boolean b6 = i > j;
        System.out.println("b6 = " + b6);
        
        boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);

        boolean b9 = (l <= k);
        System.out.println("b9 = " + b9);

            /*
            Vemos que se combinan en una línea el operador de asignación '=' y el los relacionales ' ==, >=, etc ' siempre se
            operan de derecha a izquierda o bien tienen mayor prioridad los relacionales sobre los de asignación, de todas maneras
            podemos encerrar entre paréntesis la operación entre el operador relacional para hacer más legible nuestro código
            tal cómo lo hicimos en la línea 36. (ya que el paréntesis tiene más prioridad o jerarquía de operación).
             */


        //





    }
}


