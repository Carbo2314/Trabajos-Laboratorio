import java.util.ArrayList;
public class Instituto{
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public Instituto(){

    }

    public int cantAlumnosMayores(){
        int cant =0;
        for(int i = 0; i < alumnos.size();i++){
            if(alumnos.get(i).getEdad()>17){
                cant++;
            }
        }
        return cant;
    }

    public void addAlumno(Alumno a){
        alumnos.add(a);
    }


}