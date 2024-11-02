package Seccion2_Variables;

import java.util.Scanner;

public class TareaDeLaSeccion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el nombre de la factura");
        String nombreFactura =  scanner.nextLine();

        System.out.println("Escriba el precio del primer producto");
        double producto1 = scanner.nextDouble();
        System.out.println("Escriba el precio del segundo producto");
        double producto2 = scanner.nextDouble();

        double totalBruto = producto1 + producto2;
        double impuesto = (producto1 + producto2)*0.19;
        double totalBrutoConImpuesto = totalBruto + impuesto;

        String mensaje = "La factura: " + nombreFactura + " tiene un total bruto de: " + totalBruto + ", con un impuesto de: " + impuesto + " y el monto con el impuesto agregado es: " + totalBrutoConImpuesto;

        System.out.println(mensaje);




    }
}
