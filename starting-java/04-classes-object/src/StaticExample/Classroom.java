package StaticExample;

public class Classroom {
    /*
        Las propiedades o métodos estaticos basicamente son compartidos entre
        las nuevas instancias de las clases, es decir, los métodos estaticos
        no se copian en los objetos cada que se crea una instancia si no que apunta
        al mismo valor que se tiene en la clase.

        Tenemos dos tipos de propiedades

        - De instancia que pertenece exlusivamente a cada objeto individual que se genera
        - Estaticos que pertenecen a la clase en si, o se que es compartido por todas las instancias
    */
    private static String schoolName = "Escuela técnica N° 1";
    private String studentName;

    public Classroom( String studentName ) {
        this.studentName = studentName;
    }

    public void showInfo() {
        System.out.println( "Alumno: " + studentName + " Escuela: " + schoolName );
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classroom.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
