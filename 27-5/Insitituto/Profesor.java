import java.util.ArrayList;

public class Profesor{
    private ArrayList<Materia> materias = new ArrayList<Materia>();

    public Profesor(){

    }

    public int cantMaterias(){
        return this.materias.size();
    }
    public void addMateria(Materia m){
        materias.add(m);
    }
}