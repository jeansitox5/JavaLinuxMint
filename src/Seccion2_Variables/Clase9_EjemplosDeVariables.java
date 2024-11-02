package Seccion2_Variables;

public class Clase9_EjemplosDeVariables {
    public static void main(String[] args) {

        String saludar = "Hola mundo desde Java";                               //Variable de tipo referencia, String es una clase que tiene atributos y métodos
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;                                                          //Variable de tipo primitivo
        System.out.println(numero);

        boolean valor = true;                                                  //Variable de tipo primitivo
        int numero2;                                                            //Variable de tipo primitivo

        if (valor){
            System.out.println("El valor es Verdadero");
            System.out.println(numero);
            numero2 = 100;
            System.out.println(numero2);
        }else {
            System.out.println("El valor es falso");
        }


        //Tener muy en cuenta el contexto en el que se definen (las llaves pues) {}

            //VARIABLE DE TIPADO DINÁMICO var

        var numero3 = 14;
        var nombre = "Jeanfranco";




        //  CLASE 10: REGLAS PARA DEFINIR UNA VARIABLE


        //  CLASE 11: INTRODUCCIÓN A LOS PRIMITIVOS (PDF)

        


    }
}
