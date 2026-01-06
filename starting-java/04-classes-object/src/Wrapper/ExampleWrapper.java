package Wrapper;

public class ExampleWrapper {
    public static void main( String[] args ) {
        /*
            Las clases wrapper envuelven a los tipos de datos primitivos convirtiendolos
            en objetos, esto da beneficios ya que los objetos tienen métodos. Es importante
            recordar que cada tipo de dato primitivo cuenta con su respectivo wrapper.      
        */

        int number = 19;
        /*
            El valueOf sirve para asignar el entero proporcionado a la variable,
            pero este método devuelve un Wrapper.

            Tambien sirve para convertir un string a un numero (Integer wrapper)
        */
        Integer numberOne = Integer.valueOf( 20 );
        // Esto es lo mismo que la linea de arriba pero resumido
        Integer numberTwo = 20;

        System.out.println( numberOne );
        System.out.println( numberTwo );
        System.out.println( number );

        // Convierte un string a un número
        int stringToInt = Integer.parseInt( "202020" );
        // Convierte un entero a un string
        String intToString = Integer.toString( 2020 );

        System.out.println( stringToInt );
        System.out.println( intToString );

        /*
            Sirve para comparar dos enteros:

            - Si ambos numeros son iguales retorna 0
            - Si el primero es menor que el segundo retorna un numero negativo (-1)
            - Si el primero es mayor que el segundo retorna un numero positivo
        */
       int compareResult = Integer.compare( 10, 10 );

       System.out.println( "compareResult" + compareResult );

       // Retorna el número más grande
       int numberMax = Integer.max( 10, 20 );
       // Retorna el número más pequeño
       int numberMin = Integer.min( 1, 20 );

       System.out.println( "numberMax" + numberMax );
       System.out.println( "numberMin" + numberMin );

       // TODO: Copiar todos los ejemplos wrappers
       // https://github.com/DevTalles-corp/java-wrapper-methods
    }
}
