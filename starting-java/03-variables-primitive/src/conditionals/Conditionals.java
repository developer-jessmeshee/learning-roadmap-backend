package conditionals;

public class Conditionals {
    private static final byte MAJOR_AGE = 18;

    public static void main( String[] args ) {
        /*
            Es una buena practica realizar las condiciones en variables globales para que estas
            puedan ser reutilizables, de esta manera evitamos repetir codiciones, con esto
            dejo en claro que no es buena practica realizar las validaciones directamente en el if. 
        */
        byte age = 10;
        byte dayWeekNumber = 1;
        boolean isAdult = age >= Conditionals.MAJOR_AGE;

        Conditionals.validateUserAge( age, isAdult );
        Conditionals.getNameDayWeek( dayWeekNumber );
    }

    private static void getNameDayWeek( byte day ) {
        switch ( day ) {
            case 1:
                System.out.println( "Monday" );
                break;
            case 2:
                System.out.println( "Tuesday");
                break;
            case 3:
                System.out.println( "Wednesday" );
                break;
            case 4:
                System.out.println( "Thursday" );
                break;
            case 5:
                System.out.println( "Friday" );
            case 6:
                System.out.println( "Saturday" );
                break;
            case 7:
                System.out.println( "Sunday" );
                break;
            default:
                System.out.println( "Unknown day of the week..." );
        }
    }

    private static void validateUserAge( byte age, boolean isAdult ) {
        if ( isAdult ) {
            System.out.println( "Are you of legal age..." );
        } else if ( age <= 0 ) {
            System.out.println( "Enter a valid age..." );
        } else {
            System.out.println( "You area not of legal age..." );
        }
    }
}
