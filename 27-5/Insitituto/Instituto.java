import java.util.ArrayList;

public class Instituto{
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    public Instituto(){

    }

    public void materiaProfe(){
        for(int i = 0; i < profesores.size(); i++){
            System.out.println("Profesor " + (i+1));
            System.out.println("Materias:" + profesores.get(i).cantMaterias());
        }
    }

    public void addProfe(Profesor p){
        profesores.add(p);
    }
}