public class Main{
    public static void main(String[] args){
        Instituto i = new Instituto();
        Profesor Humberto = new Profesor();
        Profesor Lopez = new Profesor();

        Materia m1 = new Materia("Matematica");
        Materia m2 = new Materia("Lengua");

        Humberto.addMateria(m1);
        Lopez.addMateria(m1);
        Lopez.addMateria(m2);
        i.addProfe(Lopez);
        i.addProfe(Humberto);

        i.materiaProfe();
    }
}