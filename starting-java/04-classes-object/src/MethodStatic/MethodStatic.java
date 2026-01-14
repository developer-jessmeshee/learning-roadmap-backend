package MethodStatic;

public class MethodStatic {
    /*
        Los métodos estaticos pertenecen a la clase y no a las instancias, se pueden usar
        sin crear objetos, basicamente podemos llamarlos haciendo referemcia a las clases en si.

        Los métodos estaticos normalmente se utilizan para helpers, operaciones matematicas o para
        resolver problemas comunes en nuestra aplicación.
    */

    public static int add( int number1, int number2 ) {
        return number1 + number2;
    }

    public static int subtract( int number1, int number2 ) {
        return number1 - number2;
    }
}
