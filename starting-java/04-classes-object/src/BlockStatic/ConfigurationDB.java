package BlockStatic;

public class ConfigurationDB {
    private final static String URL;
    private final static String USER;

    static {
        URL = "jdbc:mysql://localhost:3306/my_db";
        USER = "jess.meshee";

        System.out.println( "Configuración cargada..." );
    }

    public static void main( String[] args ) {
        System.out.println( URL );
        System.out.println( USER );
    }
}
