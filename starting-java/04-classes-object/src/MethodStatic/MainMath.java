package MethodStatic;

public class MainMath {
    public static void main( String[] args ) {
        /*
            Debemos saber que los métodos no se duplican en memoria, es decir,
            por mas que se creen 1000 instancias siempre se tendra un metodo en memoria y solo se le pasa la referencia
            del objeto, lo que si se duplican son las propiedades
        */
        int sum = MethodStatic.add( 5, 7 );
        int subtract = MethodStatic.subtract( 5, sum );

        System.out.println( sum );
        System.out.println( subtract );
    }
}
