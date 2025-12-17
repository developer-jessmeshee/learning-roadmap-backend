package constants;

public class PracticeConstants {
    public static void main( String[] args ) {
        /*
            Una constante es una varible la cual no puede cambiar su valor una vez
            que fue declarada e inicializada.
         */
        final double ANNUAL_INTEREST_RATE = 0.05;

        /*
            Tambien podemos declarar una constante e inicializarla en otra linea.
         */
        final int test;

        test = 20;

        System.out.println( ANNUAL_INTEREST_RATE );
        System.out.println( test );

        // EXAMPLE
        final double TAX_RATE = 0.10;
        int grossSalary = 14000;
        double netSalary = grossSalary * ( 1 - TAX_RATE );

        System.out.println( "netSalary = " + netSalary );
    }
}
