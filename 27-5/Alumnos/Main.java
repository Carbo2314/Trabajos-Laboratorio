public class Main{
    public static void main(String[] args){
        Instituto i = new Instituto();
        Alumno a1 = new Alumno(13);
        Alumno a2 = new Alumno(19);
        Alumno a3 = new Alumno(18);

        i.addAlumno(a1);
        i.addAlumno(a2);
        i.addAlumno(a3);
        System.out.println(i.cantAlumnosMayores());
    }
}