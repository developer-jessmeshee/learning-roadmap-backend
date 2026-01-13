package StaticExample;

public class MainClassroom {
    public static void main( String[] args ) {
        Classroom student1 = new Classroom( "Jess Meshee" );
        Classroom studen2 = new Classroom( "Minn Ara" );

        student1.showInfo();
        studen2.showInfo();

        Classroom.setSchoolName( "Escuela 2" );

        student1.showInfo();
        studen2.showInfo();
    }
}
