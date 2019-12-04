import java.util.ArrayList;

public class Perro extends Mascota {

    private String raza;
    public final int supuestacantidad = 4;

    public Perro (String razax, String nombrex, String duenox, Fecha fecha_nacimientox){

        super(nombrex, duenox, fecha_nacimientox);
        this.raza = razax;
        fechas_visita = new ArrayList<>();

    }

    public String getRaza() {
        return raza;
    }

    public int getSupuestacantidad() {
        return supuestacantidad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void agregarFechas(){

    }
}
