package BlockStatic;

/*
    Un bloque estático es un bloque de codigo dentro de una clase que se ejecuta una unica vez
    cuando la clase se carga en memoria, se ejecuta antes de que se cree cualquiero objeto y antes
    de que se ejecute el main, normalmente se utilizan para clase de configuración.

    Dentro de un bloque estatico solo podemos utilizar propiedades estaticas

*/

public class BlockStaticExample {
    static {
        // Podemos ejecutar codigo
        System.out.println( "Código ejecutado dentro del bloque estatico..." );
    }

    public static void main( String[] args ) {
        System.out.println( "Ejecutado desde el método main." );
    }
}
