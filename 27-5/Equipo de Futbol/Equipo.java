import java.util.ArrayList;

public class Equipo{
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Equipo(){

    }

    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public ArrayList getJugadoresImpar(){
        ArrayList<Jugador> resultado = new ArrayList<Jugador>();
        for(int i = 0;i<jugadores.size();i++){
            if((jugadores.get(i).getNum())%2!=0){
                resultado.add(jugadores.get(i));
            }
        }
        return resultado;
    }
}