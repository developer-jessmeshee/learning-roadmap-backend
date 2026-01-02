package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    private static final String LABEL_AGE = "Ingrese la edad: ";
    private static final String TITLE_INSTRUCTIONS = "Ingrese tres calificaciones";
    private static final String LABEL_FIRST_GRADE = "Primera calificación: ";
    private static final String LABEL_SECOND_GRADE = "Segunda calificación: ";
    private static final String LABEL_THIRD_GRADE = "Tercera calificación: ";
    private static final int MINIMUM_RATING = 6;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        boolean repeat;

        do {
            int age = createInputTypeInt( LABEL_AGE, scanner );

            System.out.println( TITLE_INSTRUCTIONS );

            int grade1 = createInputTypeInt( LABEL_FIRST_GRADE, scanner );
            int grade2 = createInputTypeInt( LABEL_SECOND_GRADE, scanner );
            int grade3 = createInputTypeInt( LABEL_THIRD_GRADE, scanner );
            double avarage = calculateAvarage( grade1, grade2, grade3 );

            if ( avarage >= MINIMUM_RATING ) {
                System.out.println( "✨ Aprobado!!! " + "Edad: " + age );
            } else {
                System.out.println( "😢 Desaprobado!!! " + "Edad: " + age );
            }

            int option = createInputTypeInt(
                "¿Desea ingresar nuevos datos? ( 1 pára sí, 0 para no )", scanner
            );

            repeat = option == 1;
        } while ( repeat );

        scanner.close();
    }

    private static double calculateAvarage( int grade1, int grade2, int grade3 ) {
        int sum = grade1 + grade2 + grade3;

        return sum / 3.0;
    }

    private static int createInputTypeInt( String label, Scanner scanner ) {
        try {
            System.out.println( label );

            return scanner.nextInt();
        } catch ( IllegalArgumentException error ) {
            scanner.next();

            throw new IllegalArgumentException( "Debe ingresar solo números enteros." );
        }
    }
}
