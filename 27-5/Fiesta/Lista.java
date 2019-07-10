import java.util.ArrayList;

public class Lista{
    private ArrayList<Persona> invitados = new ArrayList<Persona>();

    public Lista(){

    }

    public void addInvitado(Persona i){
        invitados.add(i);
    }

    public int cantInvitadosA(){
        int cant = 0;
        for(int i = 0; i < invitados.size();i++){
            if(invitados.get(i).getNombre().charAt(0) == 'A'){
                cant++;
            }
        }
        return cant;
    }
}