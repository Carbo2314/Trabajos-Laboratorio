import java.util.ArrayList;

public class Veterinaira {

    public ArrayList<Mascota> mascotas;

    public Veterinaira(){

        mascotas = new ArrayList<>();

    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void agregarMascotas(Mascota... mascotasNuevas){

        mascotas.add(1,mascotasNuevas[0]);
        mascotas.add(2,mascotasNuevas[1]);
        mascotas.add(3,mascotasNuevas[2]);
        mascotas.add(4,mascotasNuevas[3]);

    }
    public boolean cumplio_visitas(String nombre){

        //int cantidad = 0;
        //if(tipo == "perro"){cantidad = 4;}
        //else if(tipo == "gato"){cantidad = 2;}
        //else if (tipo == "tortuga"){cantidad = 1;}

        if(mascotas. >= ){return true;}
        else{return false;}

    }



}
