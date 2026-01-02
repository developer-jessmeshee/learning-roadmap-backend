package scannerExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberCompare {
    private static final String FIRST_LABEL = "Ingrese el primer número: ";
    private static final String SECOND_LABEL = "Ingrese el segundo número: ";

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        boolean success = false;

        while ( !success ) {
            try {
                int firstNumber = NumberCompare.createInputTypeInt( FIRST_LABEL, scanner );
                int secondNumber = NumberCompare.createInputTypeInt( SECOND_LABEL, scanner );

                System.out.println( "Imprimir primer número: " + firstNumber );
                System.out.println( "Imprimir el segundo número " + secondNumber );
                System.out.println( "Suma de ambos números: " + ( firstNumber + secondNumber ) );

                success = true;
            } catch ( IllegalArgumentException error ) {
                System.out.println( error.getMessage() );
            }
        }
    }

    public static int createInputTypeInt( String label, Scanner scanner ) {
        try {
            System.out.println( label );

            // Es una especie de input que permite ingresar numeros enteros.
            return scanner.nextInt();
        } catch ( InputMismatchException error ) {
            // Limpiamos el token inválido del scanner
            scanner.next();

            throw new IllegalArgumentException( "Debe ingresar solo números enteros." );
        }
    }
}
