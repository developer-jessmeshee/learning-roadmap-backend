package HouseExample;

public class HouseMain {
    public static void main( String[] args ) {
        House house = new House( 4, 1, 10 );

        house.setDoors( 10 );

        System.out.println( "La cantidad de puertas de la casa es: " + house.getDoors() );
        house.openDoor();

        double area = house.calculateArea();

        System.out.println( "El área de la casa es: " + area );
    }
}
