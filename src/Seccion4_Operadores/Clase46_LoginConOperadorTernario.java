package Seccion4_Operadores;

import java.util.Scanner;

public class Clase46_LoginConOperadorTernario {
    public static void main(String[] args) {

/*
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "jan";
        passwords[0] = "123";

        usernames[1] = "admin";
        passwords[1] = "1234";

        usernames[2] = "pepe";
        passwords[2] = "pepegod";
 */
        String[] usernames = {"jan", "admin", "pepe"};
        String[] passwords = {"123", "1234", "pepegod"};

/*        for ( int i = 0; i < usernames.length; i = i + 1){
            System.out.print(usernames[i].concat(" "));
        }
        for ( int j = 0; j < usernames.length; j++){
            System.out.println(passwords[j].concat(" "));
        }
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String u = scanner.nextLine();

        System.out.println("Ingrese la contraseña");
        String p = scanner.next();

        boolean isAuthenticated = false;

        // i++ : i = i + 1

        for (int i = 0; i < usernames.length; i++) {

            isAuthenticated = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : isAuthenticated;

            /*if ( usernames[i].equals(u) && passwords[i].equals(p)) {
                isAuthenticated = true;
                break;      // cuando una condición hace que se cumpla el if, con brake detenemos el ciclo para que no siga evaluando en los demás indices de i
            }*/
        }

        String mensaje = isAuthenticated ? "Bienvenido usuario ".concat(u).concat("!") :
                "Credenciales incorrectas, Username o contraseña incorrecto!\nlo sentimos, requiere autenticación ";
        System.out.println("mensaje = " + mensaje);

        /* if (isAuthenticated){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Credenciales incorrectas, Username o contraseña incorrectos");
            System.out.println("lo siento, requiere autenticación ");
        } */


    }
}
