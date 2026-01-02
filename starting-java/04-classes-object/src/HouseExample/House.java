package HouseExample;

public class House {
    /*
        De esta manera definimos atributos junto con los modificadores de acceso que sirven
        para encapsular datos y protegerlos. EL encapsulamiento permite controlar el acceso a
        métodos y atirbutos.

        Cuando no se le coloca un modificador de acceso por defecto tiene protected que
        basicamente es una protección de paquete, es decir, todo lo que este fuera del
        package en el que se encuentra esta clase no podra utilizarlo.

        Lo mas recomendable es que las propiedades sean privados y solo podamos acceder mediante
        setters y getters
    */
    private int doors;
    private int windows;
    private double size;

    /*
        Por defecto las clases tienen un constructor vacío, es decir, no reciben
        argumentos para asignar a atributos.

        Los constructores no especifican su valor de retorno, el objetivo
        de los constructores es asignar valores a las propiedades del objeto y establecer el
        estado inicial del mismo.

        Es importante conocer el concepto de sobrecarga de constructores y métodos,
        en java podemos colocar metodos y constructores que se llamen igual pero se
        tienen que diferenciar de manera obligatoria por la cantidad de parametros,
        es decir, dependiendo de la cantidad de parametros que mandemos java va a decidir
        a cual metodo llamar.

        This hace referncia al objeto actual en el que se encuentra
    */
    public House() { // Se le denmina constructor vacío

    }

    public House( int doors, int windows, double size ) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void openDoor() {
        System.out.println( "The door is open." );
    }

    public double calculateArea() {
        return size * size;
    }
}
