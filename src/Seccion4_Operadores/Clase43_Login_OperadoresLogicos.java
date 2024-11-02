package Seccion4_Operadores;

import java.util.Scanner;

public class Clase43_Login_OperadoresLogicos {
    public static void main(String[] args) {

        String username = "jan";
        var password = "12345";

        var username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String u = scanner.nextLine();      // nextLine() es para leer texto completo, incluyendo espacios.

        System.out.println("Ingrese la contraseña");
        String p = scanner.next();          // next() es para leer solo la siguiente palabra o fragmento hasta el primer espacio.

        boolean isAuthenticated = false;

        if( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p)) ){
            isAuthenticated = true;
        }else{
            System.out.println("Credenciales incorrectas, Username o contraseña incorrectos");
        }

        if (isAuthenticated){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("lo siento, requiere autenticación ");
        }








    }
}
