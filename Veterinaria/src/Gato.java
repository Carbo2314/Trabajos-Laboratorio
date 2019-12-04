public class Gato extends Mascota {

    private String raza;
    public final int supuestacantidad =2;

    public Gato (String razax, String nombrex, String duenox, Fecha fecha_naimientox){

        super(nombrex, duenox, fecha_naimientox);

        this.raza = razax;

    }

    public int getSupuestacantidad() {
        return supuestacantidad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
