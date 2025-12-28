package whiles;

public class WhileExamples {
    public static void main( String[] args ) {
        // WhileExamples.whileTypeFor();
        // WhileExamples.typeWhile();
        WhileExamples.typeDoWhile();
    }

    private static void whileTypeFor() {
        /*
            Algo interesante que acabo de descubrir es que si a la variable de un bucle le
            colocamos como tipo de dato byte y en la condición ponemos que sea menor a un numero, pero
            este número excede el máximo que byte puede soportar no lanza un error, simplemente entra en
            un bucle infinito y empieza a contar de esta manera 1,2,3 .. 127 ... -128, -127 ... 1, 2, 3 y la 
            condicion nunca se cumplira ya que siempre es menor.
        */

        final int MAX_COUNT = 125;

        for ( byte currentNumber = 0; currentNumber < MAX_COUNT; currentNumber++ ) {
            System.out.println( "Valor de la variable: " + currentNumber );
        }
    }

    private static void typeWhile() {
        int year = 0;
 
        while( year < 10 ) {
            year++;

            System.out.println( "El valor de la variable: " + year );
        }

        System.out.println( "Variable fuera del bucle: " + year );
    }

    private static void typeDoWhile() {
        int year = 0;

        do {
            year++;

            System.out.println( "Valor del año: " + year );
        } while( year <= 100 );
    }
}
