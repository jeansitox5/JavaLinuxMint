package Seccion2_Variables;

public class Clase23_ConversionesEntreTiposPrimitivos {
    public static void main(String[] args) {

        //debemos tener cuidado en estos casos porque podríamos llegar a tener pérdidas de información, por ejemplo si convertimos de un int a un short

        int i = 22768;                  //nos pasamos del límite del short
        short s = (short)i;             //se le llama CASTING a forzar la conversión de un tipo de dato a otro en donde se pierde información en el proceso
        System.out.println("s = " + s);
        long l = i;                     //aquí no hubo problema porque el long es mucho más grande que un int
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
                        //por tanto no es recomendable convertir datos de un tipo a otro que no no soporta la capacidad que se necesita.

        //boolean b = (boolean)i;    //aquí aunque forzemos no se puede castear porque son tipos totalmente incompatibles

        char c = (char)i;
        System.out.println("c = " + c);    //nos va a dar un caracter todo raro xd

        float f = (float)i;
        System.out.println("f = " + f);     //aquí si se puede


        //hay que tener cuidado con los casteos y sus posibles pérdidas de información y entrega de datos ambiguos; y solo castear entre tipos compatibles xddd


    }
}
