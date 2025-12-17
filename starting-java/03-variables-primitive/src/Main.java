public class Main {
    public static void main( String[] args ) {
        byte userAge = 24;

        /*
        * Debemos de colocar la palabra "F" ya sea en minúscula o mayúscula para indicarle
        * a Java que estamos tratando de almacenar un valor de tipo flotante, esto es necesario
        * ya que los numeros con decimales automaticamente son considerados de tipo double.
        */

        float priceShort = 23.89F;

        /*
            Esto podría parecer confuso ya que la palabra "F" es para indicar que es de tipo
            flotante y se lo estamos asignando a un double y Java no esta mostrando un error
            en tiempo de compilacion, esto se debe a que un double es de mayor precicion por
            ende un float se puede asignar a un double y automaticamente el float pasa a ser
            de tipo double.
         */
        double priceInDouble = 24.90F;

        System.out.println( "Edad del usuario: " + userAge );
        System.out.println( "Precio del short" + priceShort );

        /*
            Podemos declarar variables en una sola linea y asignarles un valor en
            otra linea.
        */

        int count1, count2, count3;

        count1 = 5;
        count2 = 10;
        count3 = 20;

        System.out.println( count1 + " !" + count2 + " !" + count3 );

        char initial = 'G';

        System.out.println( initial );

        // Boolean en realidad almacenan 0 y 1
        boolean isDeveloper = true;

        System.out.println( isDeveloper );
    }
}