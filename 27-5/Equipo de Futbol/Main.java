import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Equipo e = new Equipo();
        
        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Jugador j3 = new Jugador(3);
        Jugador j4 = new Jugador(4);

        e.addJugador(j1);
        e.addJugador(j2);
        e.addJugador(j3);
        e.addJugador(j4);

        ArrayList<Jugador> jugadoresImpar = e.getJugadoresImpar();

        for(int i = 0; i < jugadoresImpar.size(); i++){
            System.out.println(jugadoresImpar.get(i).getNum());
        }
    }
}