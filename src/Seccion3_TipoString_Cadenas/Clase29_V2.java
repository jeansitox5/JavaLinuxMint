package Seccion3_TipoString_Cadenas;

public class Clase29_V2 {
    public static void main(String[] args) {

        //AHORA PROBEMOS ESTA VAINA CON 1000 ITERACIONES
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);



        long tiempoInicial = System.currentTimeMillis();

        for (int i = 0; i < 1000 ; i++){
            //c = c.concat(a).concat(b).concat("\n");         // 500 => 8
            //c = c + a + b + "\n";                             // 500 => 23
            sb.append(a).append(b).append("\n");                // 500 => 0   sigue siendo muy rápido xd
        }

        long tiempoFin = System.currentTimeMillis();

        long fin = (tiempoFin - tiempoInicial);
        System.out.println("Tiempo de ejecución:    " + fin);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }
}
