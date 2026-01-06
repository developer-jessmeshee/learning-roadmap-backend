package Wrapper;

public class ExampleString {
    public static void main( String[] args ) {
        // Los Strings son inmutables
        String name = "Jess Meshee";
        String name2 = "Jess Meshee";

        /*
            Aparentemente esta variable es igual a las dos anteriores pero no es así,
            ya que al crear una instancia de String este si apunta a otro espacio
            en memoria aun que ya exista un String igual que el.

        */
        String name3 = new String( "Jess Meshee" );

        /*
            Es importante tener en cuenta que cuando comparamos dos strings
            con el operador == no compara valor si no el espacio en memoria.

            Es importante conocer el Pool String, que es basicamente que 
            Java no repite datos, es decir, si creamos dos variables
            que tienen exactamente el mismo contenido java no va a crear
            dos espacios en memoria, si no solo una, es decir, ambas variables
            apuntan al mismo espacio en memoria, por ende, las dos anteriores
            variables son iguales.
        */
        System.out.println( name == name2 );
        System.out.println( name3 == name );

        System.out.println( name.toUpperCase() );
        System.out.println( name );

        Person person = new Person( "Jess", "Meshee" );

        System.out.println( person.toString() );
    }
}
